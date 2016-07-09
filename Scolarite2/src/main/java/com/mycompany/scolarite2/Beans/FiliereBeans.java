/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.Beans;

import com.mycompany.scolarite2.data.Filiere;
import com.mycompany.scolarite2.serviceInterface.IFiliereService;
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
public class FiliereBeans {
    @ManagedProperty(value = "#{IFiliereService}")
    IFiliereService iFiliereService;
    
    Filiere filiere = new Filiere();

    public FiliereBeans() {
    }

    public IFiliereService getiFiliereService() {
        return iFiliereService;
    }

    public void setiFiliereService(IFiliereService iFiliereService) {
        this.iFiliereService = iFiliereService;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    
    
    public Filiere createFiliere() throws ServiceException{
       return iFiliereService.createFiliere(filiere);
    }

    public Filiere updateFiliere() throws ServiceException{
       return iFiliereService.updateFiliere(filiere);
    }

    public void deleteFiliere(Filiere filiere) throws ServiceException{
         iFiliereService.deleteFiliere(filiere);
    }

    public Filiere findFiliereById() throws ServiceException{
      return iFiliereService.findFiliereById(filiere.getId());
    }

    public List<Filiere> findAllFiliere() throws ServiceException{
      return iFiliereService.findAllFiliere();
    }
    
}
