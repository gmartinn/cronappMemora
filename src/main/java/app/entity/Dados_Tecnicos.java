
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
* Classe que representa a tabela DADOS_TECNICOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DADOS_TECNICOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Dados_Tecnicos")
@Converter(
  name="uuid",
  converterClass=UUIDConverter.class
)
@CronappTable(role=CronappTableRole.CLASS)
public class Dados_Tecnicos implements Serializable {
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
    @CronappColumn(attributeType="INTEGER", label="Linguagem Programacao", mask="(00) 00000-0000;0")
    @Column(name = "linguagemProgramacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer linguagemProgramacao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Situacao Programacao")
    @Column(name = "situacaoProgramacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String situacaoProgramacao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Bando Dados")
    @Column(name = "bandoDados", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String bandoDados;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Situacao Banco Dado")
    @Column(name = "situacaoBancoDado", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String situacaoBancoDado;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Infra Estrutura")
    @Column(name = "infraEstrutura", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String infraEstrutura;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Situacao Infra")
    @Column(name = "situacaoInfra", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String situacaoInfra;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Gestao")
    @Column(name = "gestao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String gestao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Situacao Gestao")
    @Column(name = "situacaoGestao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String situacaoGestao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Resumoprofissional")
    @Column(name = "resumoprofissional", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resumoprofissional;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Area Atuacao")
    @Column(name = "areaAtuacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String areaAtuacao;


    /**
    * Construtor
    * @generated
    */
    public Dados_Tecnicos(){
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
    public Dados_Tecnicos setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém linguagemProgramacao
    * return linguagemProgramacao
    * @generated
    */
    public java.lang.Integer getLinguagemProgramacao() {
        return this.linguagemProgramacao;
    }

    /**
    * Define linguagemProgramacao
    * @param linguagemProgramacao linguagemProgramacao
    * @generated
    */
    public Dados_Tecnicos setLinguagemProgramacao(java.lang.Integer linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
        return this;
    }
    /**
    * Obtém situacaoProgramacao
    * return situacaoProgramacao
    * @generated
    */
    public java.lang.String getSituacaoProgramacao() {
        return this.situacaoProgramacao;
    }

    /**
    * Define situacaoProgramacao
    * @param situacaoProgramacao situacaoProgramacao
    * @generated
    */
    public Dados_Tecnicos setSituacaoProgramacao(java.lang.String situacaoProgramacao) {
        this.situacaoProgramacao = situacaoProgramacao;
        return this;
    }
    /**
    * Obtém bandoDados
    * return bandoDados
    * @generated
    */
    public java.lang.String getBandoDados() {
        return this.bandoDados;
    }

    /**
    * Define bandoDados
    * @param bandoDados bandoDados
    * @generated
    */
    public Dados_Tecnicos setBandoDados(java.lang.String bandoDados) {
        this.bandoDados = bandoDados;
        return this;
    }
    /**
    * Obtém situacaoBancoDado
    * return situacaoBancoDado
    * @generated
    */
    public java.lang.String getSituacaoBancoDado() {
        return this.situacaoBancoDado;
    }

    /**
    * Define situacaoBancoDado
    * @param situacaoBancoDado situacaoBancoDado
    * @generated
    */
    public Dados_Tecnicos setSituacaoBancoDado(java.lang.String situacaoBancoDado) {
        this.situacaoBancoDado = situacaoBancoDado;
        return this;
    }
    /**
    * Obtém infraEstrutura
    * return infraEstrutura
    * @generated
    */
    public java.lang.String getInfraEstrutura() {
        return this.infraEstrutura;
    }

    /**
    * Define infraEstrutura
    * @param infraEstrutura infraEstrutura
    * @generated
    */
    public Dados_Tecnicos setInfraEstrutura(java.lang.String infraEstrutura) {
        this.infraEstrutura = infraEstrutura;
        return this;
    }
    /**
    * Obtém situacaoInfra
    * return situacaoInfra
    * @generated
    */
    public java.lang.String getSituacaoInfra() {
        return this.situacaoInfra;
    }

    /**
    * Define situacaoInfra
    * @param situacaoInfra situacaoInfra
    * @generated
    */
    public Dados_Tecnicos setSituacaoInfra(java.lang.String situacaoInfra) {
        this.situacaoInfra = situacaoInfra;
        return this;
    }
    /**
    * Obtém gestao
    * return gestao
    * @generated
    */
    public java.lang.String getGestao() {
        return this.gestao;
    }

    /**
    * Define gestao
    * @param gestao gestao
    * @generated
    */
    public Dados_Tecnicos setGestao(java.lang.String gestao) {
        this.gestao = gestao;
        return this;
    }
    /**
    * Obtém situacaoGestao
    * return situacaoGestao
    * @generated
    */
    public java.lang.String getSituacaoGestao() {
        return this.situacaoGestao;
    }

    /**
    * Define situacaoGestao
    * @param situacaoGestao situacaoGestao
    * @generated
    */
    public Dados_Tecnicos setSituacaoGestao(java.lang.String situacaoGestao) {
        this.situacaoGestao = situacaoGestao;
        return this;
    }
    /**
    * Obtém resumoprofissional
    * return resumoprofissional
    * @generated
    */
    public java.lang.String getResumoprofissional() {
        return this.resumoprofissional;
    }

    /**
    * Define resumoprofissional
    * @param resumoprofissional resumoprofissional
    * @generated
    */
    public Dados_Tecnicos setResumoprofissional(java.lang.String resumoprofissional) {
        this.resumoprofissional = resumoprofissional;
        return this;
    }
    /**
    * Obtém areaAtuacao
    * return areaAtuacao
    * @generated
    */
    public java.lang.String getAreaAtuacao() {
        return this.areaAtuacao;
    }

    /**
    * Define areaAtuacao
    * @param areaAtuacao areaAtuacao
    * @generated
    */
    public Dados_Tecnicos setAreaAtuacao(java.lang.String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Dados_Tecnicos object = (Dados_Tecnicos)obj;
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