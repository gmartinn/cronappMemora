
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
* Classe que representa a tabela DADOS_PESSOAIS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DADOS_PESSOAIS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Dados_Pessoais")
@CronappTable(role=CronappTableRole.CLASS)
public class Dados_Pessoais implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Cpf", mask="999.999.999-99;0", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "Cpf", nullable = false, insertable=true, updatable=true)
        private java.lang.String cpf = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Nome")
    @Column(name = "Nome", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Sexo")
    @Column(name = "Sexo", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String sexo;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Email Pessoal")
    @Column(name = "emailPessoal", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String emailPessoal;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Email Funcional")
    @Column(name = "emailFuncional", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String emailFuncional;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="PCD")
    @Column(name = "PCD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean pcD;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Endereco")
    @Column(name = "endereco", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String endereco;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Numero")
    @Column(name = "Numero", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numero;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Complemento")
    @Column(name = "Complemento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String complemento;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Bairro")
    @Column(name = "Bairro", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String bairro;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="UF")
    @Column(name = "UF", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String uf;


    /**
    * @generated
    */
    @NotEmpty
    @CronappColumn(attributeType="STRING", label="Cidade")
    @Column(name = "Cidade", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="CEP")
    @Column(name = "CEP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer ceP;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Telefone Pessoal Teste", mask="(00) 00000-0000;0")
    @Column(name = "telefonePessoalTeste", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefonePessoalTeste;


    /**
    * Construtor
    * @generated
    */
    public Dados_Pessoais(){
    }

    /**
    * Obtém cpf
    * return cpf
    * @generated
    */
    public java.lang.String getCpf() {
        return this.cpf;
    }

    /**
    * Define cpf
    * @param cpf cpf
    * @generated
    */
    public Dados_Pessoais setCpf(java.lang.String cpf) {
        this.cpf = cpf;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Dados_Pessoais setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém sexo
    * return sexo
    * @generated
    */
    public java.lang.String getSexo() {
        return this.sexo;
    }

    /**
    * Define sexo
    * @param sexo sexo
    * @generated
    */
    public Dados_Pessoais setSexo(java.lang.String sexo) {
        this.sexo = sexo;
        return this;
    }
    /**
    * Obtém emailPessoal
    * return emailPessoal
    * @generated
    */
    public java.lang.String getEmailPessoal() {
        return this.emailPessoal;
    }

    /**
    * Define emailPessoal
    * @param emailPessoal emailPessoal
    * @generated
    */
    public Dados_Pessoais setEmailPessoal(java.lang.String emailPessoal) {
        this.emailPessoal = emailPessoal;
        return this;
    }
    /**
    * Obtém emailFuncional
    * return emailFuncional
    * @generated
    */
    public java.lang.String getEmailFuncional() {
        return this.emailFuncional;
    }

    /**
    * Define emailFuncional
    * @param emailFuncional emailFuncional
    * @generated
    */
    public Dados_Pessoais setEmailFuncional(java.lang.String emailFuncional) {
        this.emailFuncional = emailFuncional;
        return this;
    }
    /**
    * Obtém pcD
    * return pcD
    * @generated
    */
    public java.lang.Boolean getPcD() {
        return this.pcD;
    }

    /**
    * Define pcD
    * @param pcD pcD
    * @generated
    */
    public Dados_Pessoais setPcD(java.lang.Boolean pcD) {
        this.pcD = pcD;
        return this;
    }
    /**
    * Obtém endereco
    * return endereco
    * @generated
    */
    public java.lang.String getEndereco() {
        return this.endereco;
    }

    /**
    * Define endereco
    * @param endereco endereco
    * @generated
    */
    public Dados_Pessoais setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
        return this;
    }
    /**
    * Obtém numero
    * return numero
    * @generated
    */
    public java.lang.Integer getNumero() {
        return this.numero;
    }

    /**
    * Define numero
    * @param numero numero
    * @generated
    */
    public Dados_Pessoais setNumero(java.lang.Integer numero) {
        this.numero = numero;
        return this;
    }
    /**
    * Obtém complemento
    * return complemento
    * @generated
    */
    public java.lang.String getComplemento() {
        return this.complemento;
    }

    /**
    * Define complemento
    * @param complemento complemento
    * @generated
    */
    public Dados_Pessoais setComplemento(java.lang.String complemento) {
        this.complemento = complemento;
        return this;
    }
    /**
    * Obtém bairro
    * return bairro
    * @generated
    */
    public java.lang.String getBairro() {
        return this.bairro;
    }

    /**
    * Define bairro
    * @param bairro bairro
    * @generated
    */
    public Dados_Pessoais setBairro(java.lang.String bairro) {
        this.bairro = bairro;
        return this;
    }
    /**
    * Obtém uf
    * return uf
    * @generated
    */
    public java.lang.String getUf() {
        return this.uf;
    }

    /**
    * Define uf
    * @param uf uf
    * @generated
    */
    public Dados_Pessoais setUf(java.lang.String uf) {
        this.uf = uf;
        return this;
    }
    /**
    * Obtém cidade
    * return cidade
    * @generated
    */
    public java.lang.String getCidade() {
        return this.cidade;
    }

    /**
    * Define cidade
    * @param cidade cidade
    * @generated
    */
    public Dados_Pessoais setCidade(java.lang.String cidade) {
        this.cidade = cidade;
        return this;
    }
    /**
    * Obtém ceP
    * return ceP
    * @generated
    */
    public java.lang.Integer getCeP() {
        return this.ceP;
    }

    /**
    * Define ceP
    * @param ceP ceP
    * @generated
    */
    public Dados_Pessoais setCeP(java.lang.Integer ceP) {
        this.ceP = ceP;
        return this;
    }
    /**
    * Obtém telefonePessoalTeste
    * return telefonePessoalTeste
    * @generated
    */
    public java.lang.String getTelefonePessoalTeste() {
        return this.telefonePessoalTeste;
    }

    /**
    * Define telefonePessoalTeste
    * @param telefonePessoalTeste telefonePessoalTeste
    * @generated
    */
    public Dados_Pessoais setTelefonePessoalTeste(java.lang.String telefonePessoalTeste) {
        this.telefonePessoalTeste = telefonePessoalTeste;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Dados_Pessoais object = (Dados_Pessoais)obj;
        if (cpf != null ? !cpf.equals(object.cpf) : object.cpf != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

}