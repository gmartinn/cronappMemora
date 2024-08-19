
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
* Classe que representa a tabela TBL_HUB_IDIOMASSEQ
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TBL_HUB_IDIOMASSEQ\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TBL_HUB_IDIOMASseq")
@CronappTable(role=CronappTableRole.CLASS)
public class TBL_HUB_IDIOMASseq implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @CronappColumn(attributeType="INTEGER", label="COD  HUB  IDIOMAS")
    @Column(name = "COD_HUB_IDIOMAS", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer coD_HUB_IDIOMAS;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * Construtor
    * @generated
    */
    public TBL_HUB_IDIOMASseq(){
    }

    /**
    * Obtém coD_HUB_IDIOMAS
    * return coD_HUB_IDIOMAS
    * @generated
    */
    public java.lang.Integer getCoD_HUB_IDIOMAS() {
        return this.coD_HUB_IDIOMAS;
    }

    /**
    * Define coD_HUB_IDIOMAS
    * @param coD_HUB_IDIOMAS coD_HUB_IDIOMAS
    * @generated
    */
    public TBL_HUB_IDIOMASseq setCoD_HUB_IDIOMAS(java.lang.Integer coD_HUB_IDIOMAS) {
        this.coD_HUB_IDIOMAS = coD_HUB_IDIOMAS;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public TBL_HUB_IDIOMASseq setName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TBL_HUB_IDIOMASseq object = (TBL_HUB_IDIOMASseq)obj;
        if (coD_HUB_IDIOMAS != null ? !coD_HUB_IDIOMAS.equals(object.coD_HUB_IDIOMAS) : object.coD_HUB_IDIOMAS != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((coD_HUB_IDIOMAS == null) ? 0 : coD_HUB_IDIOMAS.hashCode());
        return result;
    }

}