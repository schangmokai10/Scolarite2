/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author doumtsop
 */
@ManagedBean
@RequestScoped
public class OrientationBean {

    public OrientationBean() {
    }
    
    public String etudiant(){
        return "etudiant";
    }
    
    public String departement(){
        return "departement";
    }
    
    public String filiere(){
        return "filiere";
    }
    
    public String inscription(){
        return "inscription";
    }
    
    public String preinscription(){
        return "preinscription";
    }
    
    
}
