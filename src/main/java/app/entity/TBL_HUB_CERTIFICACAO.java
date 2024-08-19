
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela TBL_HUB_CERTIFICACAO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TBL_HUB_CERTIFICACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TBL_HUB_CERTIFICACAO")
@CronappTable(role=CronappTableRole.CLASS)
public class TBL_HUB_CERTIFICACAO implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="COD  HUB  CERTIFICACAO", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "COD_HUB_CERTIFICACAO", nullable = false, insertable=true, updatable=true)
        private java.lang.String coD_HUB_CERTIFICACAO = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TP  HUB  CERTIFICACAO")
    @Column(name = "TP_HUB_CERTIFICACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tp_HUB_CERTIFICACAO;


    /**
    * @generated
    */
    @CronappColumn(attributeType="CHARACTER", label="ST  EXPIRACAO")
    @Column(name = "ST_EXPIRACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Character st_EXPIRACAO;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="DT  EXPIRACAO")
    @Column(name = "DT_EXPIRACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dt_EXPIRACAO;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TX  NOME  CERTIFICACAO")
    @Column(name = "TX_NOME_CERTIFICACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tx_NOME_CERTIFICACAO;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Dt Conclusao Date")
    @Column(name = "dt_conclusaoDate", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dt_conclusaoDate;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CARGA  HORARIA")
    @Column(name = "CARGA_HORARIA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer caRGA_HORARIA;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Attribute 07")
    @Column(name = "attribute07", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String attribute07;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_TBL_HUB_AREA_CURSO_TIPO", nullable = true, referencedColumnName = "COD_HUB_AREA_CURSO_TIPO", insertable=true, updatable=true)
        
        private TBL_HUB_AREA_CURSO_TIPO tbL_HUB_AREA_CURSO_TIPO;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_TBL_HUB_CERTIFICACAO_0", nullable = true, referencedColumnName = "COD_HUB_CERTIFICACAO", insertable=true, updatable=true)
        
        private TBL_HUB_CERTIFICACAO tbL_HUB_CERTIFICACAO_0;


    /**
    * Construtor
    * @generated
    */
    public TBL_HUB_CERTIFICACAO(){
    }

    /**
    * Obtém coD_HUB_CERTIFICACAO
    * return coD_HUB_CERTIFICACAO
    * @generated
    */
    public java.lang.String getCoD_HUB_CERTIFICACAO() {
        return this.coD_HUB_CERTIFICACAO;
    }

    /**
    * Define coD_HUB_CERTIFICACAO
    * @param coD_HUB_CERTIFICACAO coD_HUB_CERTIFICACAO
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setCoD_HUB_CERTIFICACAO(java.lang.String coD_HUB_CERTIFICACAO) {
        this.coD_HUB_CERTIFICACAO = coD_HUB_CERTIFICACAO;
        return this;
    }
    /**
    * Obtém tp_HUB_CERTIFICACAO
    * return tp_HUB_CERTIFICACAO
    * @generated
    */
    public java.lang.String getTp_HUB_CERTIFICACAO() {
        return this.tp_HUB_CERTIFICACAO;
    }

    /**
    * Define tp_HUB_CERTIFICACAO
    * @param tp_HUB_CERTIFICACAO tp_HUB_CERTIFICACAO
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setTp_HUB_CERTIFICACAO(java.lang.String tp_HUB_CERTIFICACAO) {
        this.tp_HUB_CERTIFICACAO = tp_HUB_CERTIFICACAO;
        return this;
    }
    /**
    * Obtém st_EXPIRACAO
    * return st_EXPIRACAO
    * @generated
    */
    public java.lang.Character getSt_EXPIRACAO() {
        return this.st_EXPIRACAO;
    }

    /**
    * Define st_EXPIRACAO
    * @param st_EXPIRACAO st_EXPIRACAO
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setSt_EXPIRACAO(java.lang.Character st_EXPIRACAO) {
        this.st_EXPIRACAO = st_EXPIRACAO;
        return this;
    }
    /**
    * Obtém dt_EXPIRACAO
    * return dt_EXPIRACAO
    * @generated
    */
    public java.util.Date getDt_EXPIRACAO() {
        return this.dt_EXPIRACAO;
    }

    /**
    * Define dt_EXPIRACAO
    * @param dt_EXPIRACAO dt_EXPIRACAO
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setDt_EXPIRACAO(java.util.Date dt_EXPIRACAO) {
        this.dt_EXPIRACAO = dt_EXPIRACAO;
        return this;
    }
    /**
    * Obtém tx_NOME_CERTIFICACAO
    * return tx_NOME_CERTIFICACAO
    * @generated
    */
    public java.lang.String getTx_NOME_CERTIFICACAO() {
        return this.tx_NOME_CERTIFICACAO;
    }

    /**
    * Define tx_NOME_CERTIFICACAO
    * @param tx_NOME_CERTIFICACAO tx_NOME_CERTIFICACAO
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setTx_NOME_CERTIFICACAO(java.lang.String tx_NOME_CERTIFICACAO) {
        this.tx_NOME_CERTIFICACAO = tx_NOME_CERTIFICACAO;
        return this;
    }
    /**
    * Obtém dt_conclusaoDate
    * return dt_conclusaoDate
    * @generated
    */
    public java.util.Date getDt_conclusaoDate() {
        return this.dt_conclusaoDate;
    }

    /**
    * Define dt_conclusaoDate
    * @param dt_conclusaoDate dt_conclusaoDate
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setDt_conclusaoDate(java.util.Date dt_conclusaoDate) {
        this.dt_conclusaoDate = dt_conclusaoDate;
        return this;
    }
    /**
    * Obtém caRGA_HORARIA
    * return caRGA_HORARIA
    * @generated
    */
    public java.lang.Integer getCaRGA_HORARIA() {
        return this.caRGA_HORARIA;
    }

    /**
    * Define caRGA_HORARIA
    * @param caRGA_HORARIA caRGA_HORARIA
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setCaRGA_HORARIA(java.lang.Integer caRGA_HORARIA) {
        this.caRGA_HORARIA = caRGA_HORARIA;
        return this;
    }
    /**
    * Obtém attribute07
    * return attribute07
    * @generated
    */
    public java.lang.String getAttribute07() {
        return this.attribute07;
    }

    /**
    * Define attribute07
    * @param attribute07 attribute07
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setAttribute07(java.lang.String attribute07) {
        this.attribute07 = attribute07;
        return this;
    }
    /**
    * Obtém tbL_HUB_AREA_CURSO_TIPO
    * return tbL_HUB_AREA_CURSO_TIPO
    * @generated
    */
    public TBL_HUB_AREA_CURSO_TIPO getTbL_HUB_AREA_CURSO_TIPO() {
        return this.tbL_HUB_AREA_CURSO_TIPO;
    }

    /**
    * Define tbL_HUB_AREA_CURSO_TIPO
    * @param tbL_HUB_AREA_CURSO_TIPO tbL_HUB_AREA_CURSO_TIPO
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setTbL_HUB_AREA_CURSO_TIPO(TBL_HUB_AREA_CURSO_TIPO tbL_HUB_AREA_CURSO_TIPO) {
        this.tbL_HUB_AREA_CURSO_TIPO = tbL_HUB_AREA_CURSO_TIPO;
        return this;
    }
    /**
    * Obtém tbL_HUB_CERTIFICACAO_0
    * return tbL_HUB_CERTIFICACAO_0
    * @generated
    */
    public TBL_HUB_CERTIFICACAO getTbL_HUB_CERTIFICACAO_0() {
        return this.tbL_HUB_CERTIFICACAO_0;
    }

    /**
    * Define tbL_HUB_CERTIFICACAO_0
    * @param tbL_HUB_CERTIFICACAO_0 tbL_HUB_CERTIFICACAO_0
    * @generated
    */
    public TBL_HUB_CERTIFICACAO setTbL_HUB_CERTIFICACAO_0(TBL_HUB_CERTIFICACAO tbL_HUB_CERTIFICACAO_0) {
        this.tbL_HUB_CERTIFICACAO_0 = tbL_HUB_CERTIFICACAO_0;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TBL_HUB_CERTIFICACAO object = (TBL_HUB_CERTIFICACAO)obj;
        if (coD_HUB_CERTIFICACAO != null ? !coD_HUB_CERTIFICACAO.equals(object.coD_HUB_CERTIFICACAO) : object.coD_HUB_CERTIFICACAO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((coD_HUB_CERTIFICACAO == null) ? 0 : coD_HUB_CERTIFICACAO.hashCode());
        return result;
    }

}