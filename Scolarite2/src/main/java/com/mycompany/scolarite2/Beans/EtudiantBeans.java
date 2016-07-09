/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.Beans;

import com.mycompany.scolarite2.data.Departement;
import com.mycompany.scolarite2.data.Etudiant;
import com.mycompany.scolarite2.serviceInterface.IDepartementService;
import com.mycompany.scolarite2.serviceInterface.IEtudiantService;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.hibernate.service.spi.ServiceException;

/**
 *
 * @author doumtsop
 */
@ManagedBean
@RequestScoped
public class EtudiantBeans {
    @ManagedProperty(value = "#{IEtudiantService}") 
    IEtudiantService iEtudiantService;
    
    @ManagedProperty(value = "#{IDepartementService}")
    IDepartementService iDepartementService;
    
    Etudiant etudiant = new Etudiant();
    
    List<Departement> listeDepartements = new ArrayList<Departement>();
    
    Long iddepartement;

    public EtudiantBeans() {
        iddepartement = 0L;
    }

    public IEtudiantService getiEtudiantService() {
        return iEtudiantService;
    }

    public void setiEtudiantService(IEtudiantService iEtudiantService) {
        this.iEtudiantService = iEtudiantService;
    }

    public IDepartementService getiDepartementService() {
        return iDepartementService;
    }

    public void setiDepartementService(IDepartementService iDepartementService) {
        this.iDepartementService = iDepartementService;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public List<Departement> getListeDepartements() {
        return iDepartementService.findAllDepartement();
    }

    public void setListeDepartements(List<Departement> listeDepartements) {
        this.listeDepartements = listeDepartements;
    }

    public Long getIddepartement() {
        return iddepartement;
    }

    public void setIddepartement(Long iddepartement) {
        this.iddepartement = iddepartement;
    }
    
    public Etudiant createEtudiant() throws ServiceException{
       return iEtudiantService.createEtudiant(etudiant);
    }

    public Etudiant updateEtudiant() throws ServiceException{
      return iEtudiantService.updateEtudiant(etudiant);
    }

    public void deleteEtudiant() throws ServiceException{
       iEtudiantService.deleteEtudiant(etudiant);
    }

    public Etudiant findEtudiantById() throws ServiceException{
         return iEtudiantService.findEtudiantById(etudiant.getId());
    }

    public List<Etudiant> findAllEtudiant() throws ServiceException{
        return iEtudiantService.findAllEtudiant();
    
    }
    
    
}
