
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
* Classe que representa a tabela TBL_HUB_IDIOMAS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TBL_HUB_IDIOMAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TBL_HUB_IDIOMAS")
@CronappTable(role=CronappTableRole.CLASS)
public class TBL_HUB_IDIOMAS implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="COD  HUB  IDIOMAS", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "COD_HUB_IDIOMAS", nullable = false, insertable=true, updatable=true)
        private java.lang.String coD_HUB_IDIOMAS = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_idioma", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Idioma idioma;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_leitura", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Leitura leitura;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_escrita", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Escrita escrita;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_conversacao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Conversacao conversacao;


    /**
    * Construtor
    * @generated
    */
    public TBL_HUB_IDIOMAS(){
    }

    /**
    * Obtém coD_HUB_IDIOMAS
    * return coD_HUB_IDIOMAS
    * @generated
    */
    public java.lang.String getCoD_HUB_IDIOMAS() {
        return this.coD_HUB_IDIOMAS;
    }

    /**
    * Define coD_HUB_IDIOMAS
    * @param coD_HUB_IDIOMAS coD_HUB_IDIOMAS
    * @generated
    */
    public TBL_HUB_IDIOMAS setCoD_HUB_IDIOMAS(java.lang.String coD_HUB_IDIOMAS) {
        this.coD_HUB_IDIOMAS = coD_HUB_IDIOMAS;
        return this;
    }
    /**
    * Obtém idioma
    * return idioma
    * @generated
    */
    public Idioma getIdioma() {
        return this.idioma;
    }

    /**
    * Define idioma
    * @param idioma idioma
    * @generated
    */
    public TBL_HUB_IDIOMAS setIdioma(Idioma idioma) {
        this.idioma = idioma;
        return this;
    }
    /**
    * Obtém leitura
    * return leitura
    * @generated
    */
    public Leitura getLeitura() {
        return this.leitura;
    }

    /**
    * Define leitura
    * @param leitura leitura
    * @generated
    */
    public TBL_HUB_IDIOMAS setLeitura(Leitura leitura) {
        this.leitura = leitura;
        return this;
    }
    /**
    * Obtém escrita
    * return escrita
    * @generated
    */
    public Escrita getEscrita() {
        return this.escrita;
    }

    /**
    * Define escrita
    * @param escrita escrita
    * @generated
    */
    public TBL_HUB_IDIOMAS setEscrita(Escrita escrita) {
        this.escrita = escrita;
        return this;
    }
    /**
    * Obtém conversacao
    * return conversacao
    * @generated
    */
    public Conversacao getConversacao() {
        return this.conversacao;
    }

    /**
    * Define conversacao
    * @param conversacao conversacao
    * @generated
    */
    public TBL_HUB_IDIOMAS setConversacao(Conversacao conversacao) {
        this.conversacao = conversacao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TBL_HUB_IDIOMAS object = (TBL_HUB_IDIOMAS)obj;
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