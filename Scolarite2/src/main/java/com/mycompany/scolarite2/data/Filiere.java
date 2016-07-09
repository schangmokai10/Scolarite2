/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mounirah
 */
@Entity
public class Filiere implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String intitule;
    @ManyToOne
    private Departement departement;

    public Filiere(Long id, String code, String intitule, Departement departement) {
        this.id = id;
        this.code = code;
        this.intitule = intitule;
        this.departement = departement;
     }   

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
   
    

    public Filiere() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Filiere(Long id, String code, String intitule) {
        this.id = id;
        this.code = code;
        this.intitule = intitule;
    }
    
    
    
    
    
}
