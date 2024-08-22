
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
    import javax.validation.constraints.NotEmpty;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela AREACURSOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"AREACURSOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AreaCursos")
@CronappTable(role=CronappTableRole.CLASS)
public class AreaCursos implements Serializable {
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
    @CronappColumn(attributeType="INTEGER", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Descricao Area Cursos")
    @Column(name = "descricaoAreaCursos", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricaoAreaCursos;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Status")
    @Column(name = "status", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean status;


    /**
    * Construtor
    * @generated
    */
    public AreaCursos(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public AreaCursos setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descricaoAreaCursos
    * return descricaoAreaCursos
    * @generated
    */
    public java.lang.String getDescricaoAreaCursos() {
        return this.descricaoAreaCursos;
    }

    /**
    * Define descricaoAreaCursos
    * @param descricaoAreaCursos descricaoAreaCursos
    * @generated
    */
    public AreaCursos setDescricaoAreaCursos(java.lang.String descricaoAreaCursos) {
        this.descricaoAreaCursos = descricaoAreaCursos;
        return this;
    }
    /**
    * Obtém status
    * return status
    * @generated
    */
    public java.lang.Boolean getStatus() {
        return this.status;
    }

    /**
    * Define status
    * @param status status
    * @generated
    */
    public AreaCursos setStatus(java.lang.Boolean status) {
        this.status = status;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AreaCursos object = (AreaCursos)obj;
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