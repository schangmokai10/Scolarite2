/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.scolarite2.data;

import java.io.Serializable;
import javax.annotation.Generated;
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
public class Prinscription implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String date;
    @ManyToOne
    private Etudiant etudiant;

    public Prinscription(Long id, String date, Etudiant etudiant) {
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
    
    

    public Prinscription() {
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

    public Prinscription(Long id, String date) {
        this.id = id;
        this.date = date;
    }
    
    
}
