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
public class Inscription implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String date;
    @ManyToOne
    private Etudiant etudiant;

    public Inscription(Long id, String date, Etudiant etudiant) {
        this.id = id;
        this.date = date;
        this.etudiant = etudiant;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    
    

    public Inscription() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Inscription(Long id, String date) {
        this.id = id;
        this.date = date;
    }
    
    
    
}
