/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Mounirah
 */
@Entity
public class Departement implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String intitule;
    @OneToMany(mappedBy="departement")
    private List<Etudiant> listesEtudiants;
    @OneToMany(mappedBy="departement")
    private List<Filiere> listesFilieres;
    

    public Departement() {
    }

    public Departement(Long id, String code, String intitule) {
        this.id = id;
        this.code = code;
        this.intitule = intitule;
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

    public List<Etudiant> getListesEtudiants() {
        return listesEtudiants;
    }

    public void setListesEtudiants(List<Etudiant> listesEtudiants) {
        this.listesEtudiants = listesEtudiants;
    }

    public List<Filiere> getListesFilieres() {
        return listesFilieres;
    }

    public void setListesFilieres(List<Filiere> listesFilieres) {
        this.listesFilieres = listesFilieres;
    } 
}
