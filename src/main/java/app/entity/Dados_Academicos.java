
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import cronapi.database.UUIDConverter;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela DADOS_ACADEMICOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DADOS_ACADEMICOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Dados_Academicos")
@Converter(
  name="uuid",
  converterClass=UUIDConverter.class
)
@CronappTable(role=CronappTableRole.CLASS)
public class Dados_Academicos implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Convert("uuid")
    @CronappColumn(attributeType="UUID", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = true, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Leitura", mask="(00) 00000-0000;0")
    @Column(name = "leitura", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer leitura;



    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Idioma")
    @Column(name = "idioma", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String idioma;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Escrita")
    @Column(name = "escrita", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String escrita;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Conversacao")
    @Column(name = "conversacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String conversacao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Curso")
    @Column(name = "curso", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String curso;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Tipo Curso")
    @Column(name = "tipoCurso", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipoCurso;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Situacao")
    @Column(name = "situacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String situacao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Mes Ano Conclusao")
    @Column(name = "mesAnoConclusao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String mesAnoConclusao;


    /**
    * Construtor
    * @generated
    */
    public Dados_Academicos(){
    }

    /**
    * Obtém leitura
    * return leitura
    * @generated
    */
    public java.lang.Integer getLeitura() {
        return this.leitura;
    }

    /**
    * Define leitura
    * @param leitura leitura
    * @generated
    */
    public Dados_Academicos setLeitura(java.lang.Integer leitura) {
        this.leitura = leitura;
        return this;
    }
    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Dados_Academicos setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém idioma
    * return idioma
    * @generated
    */
    public java.lang.String getIdioma() {
        return this.idioma;
    }

    /**
    * Define idioma
    * @param idioma idioma
    * @generated
    */
    public Dados_Academicos setIdioma(java.lang.String idioma) {
        this.idioma = idioma;
        return this;
    }
    /**
    * Obtém escrita
    * return escrita
    * @generated
    */
    public java.lang.String getEscrita() {
        return this.escrita;
    }

    /**
    * Define escrita
    * @param escrita escrita
    * @generated
    */
    public Dados_Academicos setEscrita(java.lang.String escrita) {
        this.escrita = escrita;
        return this;
    }
    /**
    * Obtém conversacao
    * return conversacao
    * @generated
    */
    public java.lang.String getConversacao() {
        return this.conversacao;
    }

    /**
    * Define conversacao
    * @param conversacao conversacao
    * @generated
    */
    public Dados_Academicos setConversacao(java.lang.String conversacao) {
        this.conversacao = conversacao;
        return this;
    }
    /**
    * Obtém curso
    * return curso
    * @generated
    */
    public java.lang.String getCurso() {
        return this.curso;
    }

    /**
    * Define curso
    * @param curso curso
    * @generated
    */
    public Dados_Academicos setCurso(java.lang.String curso) {
        this.curso = curso;
        return this;
    }
    /**
    * Obtém tipoCurso
    * return tipoCurso
    * @generated
    */
    public java.lang.String getTipoCurso() {
        return this.tipoCurso;
    }

    /**
    * Define tipoCurso
    * @param tipoCurso tipoCurso
    * @generated
    */
    public Dados_Academicos setTipoCurso(java.lang.String tipoCurso) {
        this.tipoCurso = tipoCurso;
        return this;
    }
    /**
    * Obtém situacao
    * return situacao
    * @generated
    */
    public java.lang.String getSituacao() {
        return this.situacao;
    }

    /**
    * Define situacao
    * @param situacao situacao
    * @generated
    */
    public Dados_Academicos setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
        return this;
    }
    /**
    * Obtém mesAnoConclusao
    * return mesAnoConclusao
    * @generated
    */
    public java.lang.String getMesAnoConclusao() {
        return this.mesAnoConclusao;
    }

    /**
    * Define mesAnoConclusao
    * @param mesAnoConclusao mesAnoConclusao
    * @generated
    */
    public Dados_Academicos setMesAnoConclusao(java.lang.String mesAnoConclusao) {
        this.mesAnoConclusao = mesAnoConclusao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Dados_Academicos object = (Dados_Academicos)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}