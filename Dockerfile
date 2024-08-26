## Consulte a documentação do Docker em https://docs.cronapp.io para informações sobre o conteúdo desse arquivo.
 
FROM cronapp/maven_builder:1.0.0 AS maven_builder

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH

WORKDIR /app
ADD pom.xml /app/pom.xml
RUN git config --global url."https://".insteadOf git://
ARG TIER
ARG CONTEXT_USE
ARG MOBILE_APP
 
## Para repositório EXTERNO não é necessário alterações.
## Para repositório INTERNO comente as linhas 16, 17 e 18 e retire os comentários nas linhas 21, 22, 23 e 24.
 
## Usando repositórios externo - JAR e NPM
RUN mvn dependency:go-offline -B
ADD . /app
RUN cd /app && mvn package -X -Dcronapp.profile=${TIER} -Dcronapp.useContext=${CONTEXT_USE} -Dcronapp.mobileapp=${MOBILE_APP}
 
## Usando repositórios interno - JAR e NPM
#ADD settings.xml  $HOME/.m2/settings.xml
#RUN npm config set registry https://my.registry.com/your-repository/name && mvn -s /app/settings.xml dependency:go-offline -B
#ADD . /app
#RUN cd /app && mvn -s /app/settings.xml package -X -Dcronapp.profile=${TIER} -Dcronapp.useContext=${CONTEXT_USE} -Dcronapp.mobileapp=${MOBILE_APP}

FROM docker.io/cronapp/runtime:1.0.0 AS cronapp-base
ENV CRN_MEM="8080"
ENV CRN_TIMEZONE="America/Fortaleza"
ENV CRN_GZIP="on"
ENV CRN_STATIC="false"
ENV CRN_SERVER_HOST=""

 


#nginx
FROM nginx:1.26.2-alpine-slim AS nginx-stage
COPY --from=maven_builder /app/target/*.war /tmp
RUN unzip -o /tmp/*.war -d /usr/share/nginx/html

COPY environments/hostApp.js /usr/share/nginx/html/js/hostApp.js

COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 8085

CMD ["nginx", "-g", "daemon off;"]
