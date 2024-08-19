
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import cronapi.database.UUIDConverter;
    import javax.validation.constraints.NotEmpty;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela DADOS_PROFISSIONAIS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DADOS_PROFISSIONAIS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Dados_Profissionais")
@Converter(
  name="uuid",
  converterClass=UUIDConverter.class
)
@CronappTable(role=CronappTableRole.CLASS)
public class Dados_Profissionais implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Convert("uuid")
    @CronappColumn(attributeType="UUID", label="Id", mask="999.999.999-99;0", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Curso Certificacao")
    @Column(name = "cursoCertificacao", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cursoCertificacao;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Area")
    @Column(name = "area", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String area;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Tipo")
    @Column(name = "tipo", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipo;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Expiracao")
    @Column(name = "expiracao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String expiracao;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Mes Ano Expiracao")
    @Column(name = "mesAnoExpiracao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date mesAnoExpiracao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nome Curso")
    @Column(name = "nomeCurso", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeCurso;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Mes Ano Conclusao")
    @Column(name = "mesAnoConclusao", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date mesAnoConclusao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Carga Horaria")
    @Column(name = "cargaHoraria", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cargaHoraria;


    /**
    * Construtor
    * @generated
    */
    public Dados_Profissionais(){
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
    public Dados_Profissionais setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém cursoCertificacao
    * return cursoCertificacao
    * @generated
    */
    public java.lang.String getCursoCertificacao() {
        return this.cursoCertificacao;
    }

    /**
    * Define cursoCertificacao
    * @param cursoCertificacao cursoCertificacao
    * @generated
    */
    public Dados_Profissionais setCursoCertificacao(java.lang.String cursoCertificacao) {
        this.cursoCertificacao = cursoCertificacao;
        return this;
    }
    /**
    * Obtém area
    * return area
    * @generated
    */
    public java.lang.String getArea() {
        return this.area;
    }

    /**
    * Define area
    * @param area area
    * @generated
    */
    public Dados_Profissionais setArea(java.lang.String area) {
        this.area = area;
        return this;
    }
    /**
    * Obtém tipo
    * return tipo
    * @generated
    */
    public java.lang.String getTipo() {
        return this.tipo;
    }

    /**
    * Define tipo
    * @param tipo tipo
    * @generated
    */
    public Dados_Profissionais setTipo(java.lang.String tipo) {
        this.tipo = tipo;
        return this;
    }
    /**
    * Obtém expiracao
    * return expiracao
    * @generated
    */
    public java.lang.String getExpiracao() {
        return this.expiracao;
    }

    /**
    * Define expiracao
    * @param expiracao expiracao
    * @generated
    */
    public Dados_Profissionais setExpiracao(java.lang.String expiracao) {
        this.expiracao = expiracao;
        return this;
    }
    /**
    * Obtém mesAnoExpiracao
    * return mesAnoExpiracao
    * @generated
    */
    public java.util.Date getMesAnoExpiracao() {
        return this.mesAnoExpiracao;
    }

    /**
    * Define mesAnoExpiracao
    * @param mesAnoExpiracao mesAnoExpiracao
    * @generated
    */
    public Dados_Profissionais setMesAnoExpiracao(java.util.Date mesAnoExpiracao) {
        this.mesAnoExpiracao = mesAnoExpiracao;
        return this;
    }
    /**
    * Obtém nomeCurso
    * return nomeCurso
    * @generated
    */
    public java.lang.String getNomeCurso() {
        return this.nomeCurso;
    }

    /**
    * Define nomeCurso
    * @param nomeCurso nomeCurso
    * @generated
    */
    public Dados_Profissionais setNomeCurso(java.lang.String nomeCurso) {
        this.nomeCurso = nomeCurso;
        return this;
    }
    /**
    * Obtém mesAnoConclusao
    * return mesAnoConclusao
    * @generated
    */
    public java.util.Date getMesAnoConclusao() {
        return this.mesAnoConclusao;
    }

    /**
    * Define mesAnoConclusao
    * @param mesAnoConclusao mesAnoConclusao
    * @generated
    */
    public Dados_Profissionais setMesAnoConclusao(java.util.Date mesAnoConclusao) {
        this.mesAnoConclusao = mesAnoConclusao;
        return this;
    }
    /**
    * Obtém cargaHoraria
    * return cargaHoraria
    * @generated
    */
    public java.lang.String getCargaHoraria() {
        return this.cargaHoraria;
    }

    /**
    * Define cargaHoraria
    * @param cargaHoraria cargaHoraria
    * @generated
    */
    public Dados_Profissionais setCargaHoraria(java.lang.String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Dados_Profissionais object = (Dados_Profissionais)obj;
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