
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
* Classe que representa a tabela TBL_HUB_AREA_CURSO_TIPO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TBL_HUB_AREA_CURSO_TIPO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TBL_HUB_AREA_CURSO_TIPO")
@CronappTable(role=CronappTableRole.CLASS)
public class TBL_HUB_AREA_CURSO_TIPO implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="COD  HUB  AREA  CURSO  TIPO", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "COD_HUB_AREA_CURSO_TIPO", nullable = false, insertable=true, updatable=true)
        private java.lang.String coD_HUB_AREA_CURSO_TIPO = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TX  NOME  AREA  CURSO  TIPO")
    @Column(name = "TX_NOME_AREA_CURSO_TIPO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tx_NOME_AREA_CURSO_TIPO;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ST  STATUS  AREA  CURSO  TIPO")
    @Column(name = "ST_STATUS_AREA_CURSO_TIPO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String st_STATUS_AREA_CURSO_TIPO;


    /**
    * Construtor
    * @generated
    */
    public TBL_HUB_AREA_CURSO_TIPO(){
    }

    /**
    * Obtém coD_HUB_AREA_CURSO_TIPO
    * return coD_HUB_AREA_CURSO_TIPO
    * @generated
    */
    public java.lang.String getCoD_HUB_AREA_CURSO_TIPO() {
        return this.coD_HUB_AREA_CURSO_TIPO;
    }

    /**
    * Define coD_HUB_AREA_CURSO_TIPO
    * @param coD_HUB_AREA_CURSO_TIPO coD_HUB_AREA_CURSO_TIPO
    * @generated
    */
    public TBL_HUB_AREA_CURSO_TIPO setCoD_HUB_AREA_CURSO_TIPO(java.lang.String coD_HUB_AREA_CURSO_TIPO) {
        this.coD_HUB_AREA_CURSO_TIPO = coD_HUB_AREA_CURSO_TIPO;
        return this;
    }
    /**
    * Obtém tx_NOME_AREA_CURSO_TIPO
    * return tx_NOME_AREA_CURSO_TIPO
    * @generated
    */
    public java.lang.String getTx_NOME_AREA_CURSO_TIPO() {
        return this.tx_NOME_AREA_CURSO_TIPO;
    }

    /**
    * Define tx_NOME_AREA_CURSO_TIPO
    * @param tx_NOME_AREA_CURSO_TIPO tx_NOME_AREA_CURSO_TIPO
    * @generated
    */
    public TBL_HUB_AREA_CURSO_TIPO setTx_NOME_AREA_CURSO_TIPO(java.lang.String tx_NOME_AREA_CURSO_TIPO) {
        this.tx_NOME_AREA_CURSO_TIPO = tx_NOME_AREA_CURSO_TIPO;
        return this;
    }
    /**
    * Obtém st_STATUS_AREA_CURSO_TIPO
    * return st_STATUS_AREA_CURSO_TIPO
    * @generated
    */
    public java.lang.String getSt_STATUS_AREA_CURSO_TIPO() {
        return this.st_STATUS_AREA_CURSO_TIPO;
    }

    /**
    * Define st_STATUS_AREA_CURSO_TIPO
    * @param st_STATUS_AREA_CURSO_TIPO st_STATUS_AREA_CURSO_TIPO
    * @generated
    */
    public TBL_HUB_AREA_CURSO_TIPO setSt_STATUS_AREA_CURSO_TIPO(java.lang.String st_STATUS_AREA_CURSO_TIPO) {
        this.st_STATUS_AREA_CURSO_TIPO = st_STATUS_AREA_CURSO_TIPO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TBL_HUB_AREA_CURSO_TIPO object = (TBL_HUB_AREA_CURSO_TIPO)obj;
        if (coD_HUB_AREA_CURSO_TIPO != null ? !coD_HUB_AREA_CURSO_TIPO.equals(object.coD_HUB_AREA_CURSO_TIPO) : object.coD_HUB_AREA_CURSO_TIPO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((coD_HUB_AREA_CURSO_TIPO == null) ? 0 : coD_HUB_AREA_CURSO_TIPO.hashCode());
        return result;
    }

}