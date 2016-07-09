/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.Beans;

import com.mycompany.scolarite2.data.Departement;
import com.mycompany.scolarite2.serviceInterface.IDepartementService;
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
public class DepartementBeans {
    @ManagedProperty(value = "#{IDepartementService}")
    IDepartementService iDepartementService;
    
    Departement departement=new Departement();

    public DepartementBeans() {
    }

    public IDepartementService getiDepartementService() {
        return iDepartementService;
    }

    public void setiDepartementService(IDepartementService iDepartementService) {
        this.iDepartementService = iDepartementService;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    
    public Departement createDepartement() throws ServiceException{
      return iDepartementService.createDepartement(departement);
    }

    public Departement updateDepartement() throws ServiceException{
     return iDepartementService.updateDepartement(departement);
    }

    public void deleteDepartement() throws ServiceException{
     iDepartementService.deleteDepartement(departement);
    }

    public Departement findDepartementById() throws ServiceException{
     return iDepartementService.findDepartementById(departement.getId());
    }

    public List<Departement> findAllDepartement() throws ServiceException{
      return iDepartementService.findAllDepartement();
    }
    
}
