
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
* Classe que representa a tabela DEVICE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DEVICE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Device")
@CronappTable(role=CronappTableRole.CLASS)
public class Device implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Token")
    @Column(name = "token", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String token;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Platform")
    @Column(name = "platform", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String platform;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Model")
    @Column(name = "model", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String model;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Platform Version")
    @Column(name = "platformVersion", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String platformVersion;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="App Name")
    @Column(name = "appName", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String appName;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="App Version")
    @Column(name = "appVersion", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String appVersion;


    /**
    * Construtor
    * @generated
    */
    public Device(){
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
    public Device setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém token
    * return token
    * @generated
    */
    public java.lang.String getToken() {
        return this.token;
    }

    /**
    * Define token
    * @param token token
    * @generated
    */
    public Device setToken(java.lang.String token) {
        this.token = token;
        return this;
    }
    /**
    * Obtém platform
    * return platform
    * @generated
    */
    public java.lang.String getPlatform() {
        return this.platform;
    }

    /**
    * Define platform
    * @param platform platform
    * @generated
    */
    public Device setPlatform(java.lang.String platform) {
        this.platform = platform;
        return this;
    }
    /**
    * Obtém model
    * return model
    * @generated
    */
    public java.lang.String getModel() {
        return this.model;
    }

    /**
    * Define model
    * @param model model
    * @generated
    */
    public Device setModel(java.lang.String model) {
        this.model = model;
        return this;
    }
    /**
    * Obtém platformVersion
    * return platformVersion
    * @generated
    */
    public java.lang.String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
    * Define platformVersion
    * @param platformVersion platformVersion
    * @generated
    */
    public Device setPlatformVersion(java.lang.String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }
    /**
    * Obtém appName
    * return appName
    * @generated
    */
    public java.lang.String getAppName() {
        return this.appName;
    }

    /**
    * Define appName
    * @param appName appName
    * @generated
    */
    public Device setAppName(java.lang.String appName) {
        this.appName = appName;
        return this;
    }
    /**
    * Obtém appVersion
    * return appVersion
    * @generated
    */
    public java.lang.String getAppVersion() {
        return this.appVersion;
    }

    /**
    * Define appVersion
    * @param appVersion appVersion
    * @generated
    */
    public Device setAppVersion(java.lang.String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Device object = (Device)obj;
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