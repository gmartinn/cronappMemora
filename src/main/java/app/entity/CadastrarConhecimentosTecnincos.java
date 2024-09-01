
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
* Classe que representa a tabela CADASTRARCONHECIMENTOSTECNINCOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CADASTRARCONHECIMENTOSTECNINCOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CadastrarConhecimentosTecnincos")
@CronappTable(role=CronappTableRole.CLASS)
public class CadastrarConhecimentosTecnincos implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Descricao")
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nivel")
    @Column(name = "nivel", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nivel;


    /**
    * Construtor
    * @generated
    */
    public CadastrarConhecimentosTecnincos(){
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
    public CadastrarConhecimentosTecnincos setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    public java.lang.String getDescricao() {
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public CadastrarConhecimentosTecnincos setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém nivel
    * return nivel
    * @generated
    */
    public java.lang.String getNivel() {
        return this.nivel;
    }

    /**
    * Define nivel
    * @param nivel nivel
    * @generated
    */
    public CadastrarConhecimentosTecnincos setNivel(java.lang.String nivel) {
        this.nivel = nivel;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CadastrarConhecimentosTecnincos object = (CadastrarConhecimentosTecnincos)obj;
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