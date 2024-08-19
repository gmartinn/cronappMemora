
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
* Classe que representa a tabela TBL_HUB_AREA_ATUACAO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TBL_HUB_AREA_ATUACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TBL_HUB_AREA_ATUACAO")
@CronappTable(role=CronappTableRole.CLASS)
public class TBL_HUB_AREA_ATUACAO implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="COD  HUB  AREA  ATUACAO", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "COD_HUB_AREA_ATUACAO", nullable = false, insertable=true, updatable=true)
        private java.lang.String coD_HUB_AREA_ATUACAO = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TX  NOME  AREA  ATUACAO")
    @Column(name = "TX_NOME_AREA_ATUACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tx_NOME_AREA_ATUACAO;


    /**
    * @generated
    */
    @CronappColumn(attributeType="CHARACTER", label="SIT  CURSO")
    @Column(name = "SIT_CURSO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Character siT_CURSO;


    /**
    * Construtor
    * @generated
    */
    public TBL_HUB_AREA_ATUACAO(){
    }

    /**
    * Obtém coD_HUB_AREA_ATUACAO
    * return coD_HUB_AREA_ATUACAO
    * @generated
    */
    public java.lang.String getCoD_HUB_AREA_ATUACAO() {
        return this.coD_HUB_AREA_ATUACAO;
    }

    /**
    * Define coD_HUB_AREA_ATUACAO
    * @param coD_HUB_AREA_ATUACAO coD_HUB_AREA_ATUACAO
    * @generated
    */
    public TBL_HUB_AREA_ATUACAO setCoD_HUB_AREA_ATUACAO(java.lang.String coD_HUB_AREA_ATUACAO) {
        this.coD_HUB_AREA_ATUACAO = coD_HUB_AREA_ATUACAO;
        return this;
    }
    /**
    * Obtém tx_NOME_AREA_ATUACAO
    * return tx_NOME_AREA_ATUACAO
    * @generated
    */
    public java.lang.String getTx_NOME_AREA_ATUACAO() {
        return this.tx_NOME_AREA_ATUACAO;
    }

    /**
    * Define tx_NOME_AREA_ATUACAO
    * @param tx_NOME_AREA_ATUACAO tx_NOME_AREA_ATUACAO
    * @generated
    */
    public TBL_HUB_AREA_ATUACAO setTx_NOME_AREA_ATUACAO(java.lang.String tx_NOME_AREA_ATUACAO) {
        this.tx_NOME_AREA_ATUACAO = tx_NOME_AREA_ATUACAO;
        return this;
    }
    /**
    * Obtém siT_CURSO
    * return siT_CURSO
    * @generated
    */
    public java.lang.Character getSiT_CURSO() {
        return this.siT_CURSO;
    }

    /**
    * Define siT_CURSO
    * @param siT_CURSO siT_CURSO
    * @generated
    */
    public TBL_HUB_AREA_ATUACAO setSiT_CURSO(java.lang.Character siT_CURSO) {
        this.siT_CURSO = siT_CURSO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TBL_HUB_AREA_ATUACAO object = (TBL_HUB_AREA_ATUACAO)obj;
        if (coD_HUB_AREA_ATUACAO != null ? !coD_HUB_AREA_ATUACAO.equals(object.coD_HUB_AREA_ATUACAO) : object.coD_HUB_AREA_ATUACAO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((coD_HUB_AREA_ATUACAO == null) ? 0 : coD_HUB_AREA_ATUACAO.hashCode());
        return result;
    }

}