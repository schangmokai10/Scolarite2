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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Mounirah
 */
@Entity
public class Etudiant implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String dateNaissance;
    @Column
    private String cni;
    @ManyToOne
    private Departement departement;
    @OneToMany(mappedBy="etudiant")
    private List<Inscription> listesIncriptions;
    @OneToMany(mappedBy="etudiant")
    private List<Prinscription> listesPrinscriptions;

    public Etudiant(Long id, String nom, String prenom, String dateNaissance, String cni, Departement departement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.cni = cni;
        this.departement = departement;
    }
    

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    


    public Etudiant() {
    }

    public Etudiant(Long id, String nom, String prenom, String dateNaissance, String cni) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.cni = cni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public List<Inscription> getListesIncriptions() {
        return listesIncriptions;
    }

    public void setListesIncriptions(List<Inscription> listesIncriptions) {
        this.listesIncriptions = listesIncriptions;
    }

    public List<Prinscription> getListesPrinscriptions() {
        return listesPrinscriptions;
    }

    public void setListesPrinscriptions(List<Prinscription> listesPrinscriptions) {
        this.listesPrinscriptions = listesPrinscriptions;
    }
    
    
    
}