
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
* Classe que representa a tabela CURSOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CURSOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cursos")
@CronappTable(role=CronappTableRole.CLASS)
public class Cursos implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Descricao Do Curso Academico")
    @Column(name = "descricaoDoCursoAcademico", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricaoDoCursoAcademico;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Tipo Curso")
    @Column(name = "tipoCurso", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipoCurso;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Status")
    @Column(name = "Status", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean status;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Conclusao")
    @Column(name = "dataConclusao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataConclusao;


    /**
    * Construtor
    * @generated
    */
    public Cursos(){
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
    public Cursos setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descricaoDoCursoAcademico
    * return descricaoDoCursoAcademico
    * @generated
    */
    public java.lang.String getDescricaoDoCursoAcademico() {
        return this.descricaoDoCursoAcademico;
    }

    /**
    * Define descricaoDoCursoAcademico
    * @param descricaoDoCursoAcademico descricaoDoCursoAcademico
    * @generated
    */
    public Cursos setDescricaoDoCursoAcademico(java.lang.String descricaoDoCursoAcademico) {
        this.descricaoDoCursoAcademico = descricaoDoCursoAcademico;
        return this;
    }
    /**
    * Obtém tipoCurso
    * return tipoCurso
    * @generated
    */
    public java.lang.String getTipoCurso() {
        return this.tipoCurso;
    }

    /**
    * Define tipoCurso
    * @param tipoCurso tipoCurso
    * @generated
    */
    public Cursos setTipoCurso(java.lang.String tipoCurso) {
        this.tipoCurso = tipoCurso;
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
    public Cursos setStatus(java.lang.Boolean status) {
        this.status = status;
        return this;
    }
    /**
    * Obtém dataConclusao
    * return dataConclusao
    * @generated
    */
    public java.util.Date getDataConclusao() {
        return this.dataConclusao;
    }

    /**
    * Define dataConclusao
    * @param dataConclusao dataConclusao
    * @generated
    */
    public Cursos setDataConclusao(java.util.Date dataConclusao) {
        this.dataConclusao = dataConclusao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cursos object = (Cursos)obj;
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