
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
* Classe que representa a tabela TBL_HUB_CONHECIMENTOS_TECNICOS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TBL_HUB_CONHECIMENTOS_TECNICOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TBL_HUB_CONHECIMENTOS_TECNICOS")
@CronappTable(role=CronappTableRole.CLASS)
public class TBL_HUB_CONHECIMENTOS_TECNICOS implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="TX  RESUMO  PROFISSIONAL")
    @Column(name = "TX_RESUMO_PROFISSIONAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tx_RESUMO_PROFISSIONAL;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_TBL_HUB_AREA_CURSO", nullable = true, referencedColumnName = "COD_HUB_AREA_CURSO", insertable=true, updatable=true)
        
        private TBL_HUB_AREA_CURSO tbL_HUB_AREA_CURSO;


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
    @JoinColumn(name="fk_TBL_HUB_AREA_ATUACAO", nullable = true, referencedColumnName = "COD_HUB_AREA_ATUACAO", insertable=true, updatable=true)
        
        private TBL_HUB_AREA_ATUACAO tbL_HUB_AREA_ATUACAO;


    /**
    * Construtor
    * @generated
    */
    public TBL_HUB_CONHECIMENTOS_TECNICOS(){
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
    public TBL_HUB_CONHECIMENTOS_TECNICOS setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém tx_RESUMO_PROFISSIONAL
    * return tx_RESUMO_PROFISSIONAL
    * @generated
    */
    public java.lang.String getTx_RESUMO_PROFISSIONAL() {
        return this.tx_RESUMO_PROFISSIONAL;
    }

    /**
    * Define tx_RESUMO_PROFISSIONAL
    * @param tx_RESUMO_PROFISSIONAL tx_RESUMO_PROFISSIONAL
    * @generated
    */
    public TBL_HUB_CONHECIMENTOS_TECNICOS setTx_RESUMO_PROFISSIONAL(java.lang.String tx_RESUMO_PROFISSIONAL) {
        this.tx_RESUMO_PROFISSIONAL = tx_RESUMO_PROFISSIONAL;
        return this;
    }
    /**
    * Obtém tbL_HUB_AREA_CURSO
    * return tbL_HUB_AREA_CURSO
    * @generated
    */
    public TBL_HUB_AREA_CURSO getTbL_HUB_AREA_CURSO() {
        return this.tbL_HUB_AREA_CURSO;
    }

    /**
    * Define tbL_HUB_AREA_CURSO
    * @param tbL_HUB_AREA_CURSO tbL_HUB_AREA_CURSO
    * @generated
    */
    public TBL_HUB_CONHECIMENTOS_TECNICOS setTbL_HUB_AREA_CURSO(TBL_HUB_AREA_CURSO tbL_HUB_AREA_CURSO) {
        this.tbL_HUB_AREA_CURSO = tbL_HUB_AREA_CURSO;
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
    public TBL_HUB_CONHECIMENTOS_TECNICOS setTbL_HUB_AREA_CURSO_TIPO(TBL_HUB_AREA_CURSO_TIPO tbL_HUB_AREA_CURSO_TIPO) {
        this.tbL_HUB_AREA_CURSO_TIPO = tbL_HUB_AREA_CURSO_TIPO;
        return this;
    }
    /**
    * Obtém tbL_HUB_AREA_ATUACAO
    * return tbL_HUB_AREA_ATUACAO
    * @generated
    */
    public TBL_HUB_AREA_ATUACAO getTbL_HUB_AREA_ATUACAO() {
        return this.tbL_HUB_AREA_ATUACAO;
    }

    /**
    * Define tbL_HUB_AREA_ATUACAO
    * @param tbL_HUB_AREA_ATUACAO tbL_HUB_AREA_ATUACAO
    * @generated
    */
    public TBL_HUB_CONHECIMENTOS_TECNICOS setTbL_HUB_AREA_ATUACAO(TBL_HUB_AREA_ATUACAO tbL_HUB_AREA_ATUACAO) {
        this.tbL_HUB_AREA_ATUACAO = tbL_HUB_AREA_ATUACAO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TBL_HUB_CONHECIMENTOS_TECNICOS object = (TBL_HUB_CONHECIMENTOS_TECNICOS)obj;
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