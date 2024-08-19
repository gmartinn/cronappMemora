
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
* Classe que representa a tabela ESCRITA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ESCRITA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Escrita")
@CronappTable(role=CronappTableRole.CLASS)
public class Escrita implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Opcao")
    @Column(name = "opcao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String opcao;


    /**
    * Construtor
    * @generated
    */
    public Escrita(){
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
    public Escrita setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém opcao
    * return opcao
    * @generated
    */
    public java.lang.String getOpcao() {
        return this.opcao;
    }

    /**
    * Define opcao
    * @param opcao opcao
    * @generated
    */
    public Escrita setOpcao(java.lang.String opcao) {
        this.opcao = opcao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Escrita object = (Escrita)obj;
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