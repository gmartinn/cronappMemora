
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
* Classe que representa a tabela TBL_HUB_AREA_CURSO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TBL_HUB_AREA_CURSO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TBL_HUB_AREA_CURSO")
@CronappTable(role=CronappTableRole.CLASS)
public class TBL_HUB_AREA_CURSO implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="COD  HUB  AREA  CURSO", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "COD_HUB_AREA_CURSO", nullable = false, insertable=true, updatable=true)
        private java.lang.String coD_HUB_AREA_CURSO = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="TX  NOME  AREA  CURSO")
    @Column(name = "TX_NOME_AREA_CURSO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tx_NOME_AREA_CURSO;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="ST  STATUS  AREA  CURSO")
    @Column(name = "ST_STATUS_AREA_CURSO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String st_STATUS_AREA_CURSO;


    /**
    * Construtor
    * @generated
    */
    public TBL_HUB_AREA_CURSO(){
    }

    /**
    * Obtém coD_HUB_AREA_CURSO
    * return coD_HUB_AREA_CURSO
    * @generated
    */
    public java.lang.String getCoD_HUB_AREA_CURSO() {
        return this.coD_HUB_AREA_CURSO;
    }

    /**
    * Define coD_HUB_AREA_CURSO
    * @param coD_HUB_AREA_CURSO coD_HUB_AREA_CURSO
    * @generated
    */
    public TBL_HUB_AREA_CURSO setCoD_HUB_AREA_CURSO(java.lang.String coD_HUB_AREA_CURSO) {
        this.coD_HUB_AREA_CURSO = coD_HUB_AREA_CURSO;
        return this;
    }
    /**
    * Obtém tx_NOME_AREA_CURSO
    * return tx_NOME_AREA_CURSO
    * @generated
    */
    public java.lang.String getTx_NOME_AREA_CURSO() {
        return this.tx_NOME_AREA_CURSO;
    }

    /**
    * Define tx_NOME_AREA_CURSO
    * @param tx_NOME_AREA_CURSO tx_NOME_AREA_CURSO
    * @generated
    */
    public TBL_HUB_AREA_CURSO setTx_NOME_AREA_CURSO(java.lang.String tx_NOME_AREA_CURSO) {
        this.tx_NOME_AREA_CURSO = tx_NOME_AREA_CURSO;
        return this;
    }
    /**
    * Obtém st_STATUS_AREA_CURSO
    * return st_STATUS_AREA_CURSO
    * @generated
    */
    public java.lang.String getSt_STATUS_AREA_CURSO() {
        return this.st_STATUS_AREA_CURSO;
    }

    /**
    * Define st_STATUS_AREA_CURSO
    * @param st_STATUS_AREA_CURSO st_STATUS_AREA_CURSO
    * @generated
    */
    public TBL_HUB_AREA_CURSO setSt_STATUS_AREA_CURSO(java.lang.String st_STATUS_AREA_CURSO) {
        this.st_STATUS_AREA_CURSO = st_STATUS_AREA_CURSO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TBL_HUB_AREA_CURSO object = (TBL_HUB_AREA_CURSO)obj;
        if (coD_HUB_AREA_CURSO != null ? !coD_HUB_AREA_CURSO.equals(object.coD_HUB_AREA_CURSO) : object.coD_HUB_AREA_CURSO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((coD_HUB_AREA_CURSO == null) ? 0 : coD_HUB_AREA_CURSO.hashCode());
        return result;
    }

}