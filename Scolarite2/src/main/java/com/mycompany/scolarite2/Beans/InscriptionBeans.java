/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.Beans;

import com.mycompany.scolarite2.data.Inscription;
import com.mycompany.scolarite2.serviceInterface.IInscriptionService;
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
public class InscriptionBeans {
    @ManagedProperty(value = "#{IInscriptionService}")
    IInscriptionService iInscriptionService;
    
    Inscription inscription = new Inscription();

    public InscriptionBeans() {
    }

    public IInscriptionService getiInscriptionService() {
        return iInscriptionService;
    }

    public void setiInscriptionService(IInscriptionService iInscriptionService) {
        this.iInscriptionService = iInscriptionService;
    }

    public Inscription getInscription() {
        return inscription;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }
    
    
    
    public Inscription createInscription() throws ServiceException{
       return iInscriptionService.createInscription(inscription);
    }

    public Inscription updateInscription() throws ServiceException{
       return iInscriptionService.updateInscription(inscription);
    }

    public void deleteInscription() throws ServiceException{
      iInscriptionService.deleteInscription(inscription);
    }

    public Inscription findInscriptionById() throws ServiceException{
     return iInscriptionService.findInscriptionById(inscription.getId());
    }

    public List<Inscription> findAllInscription() throws ServiceException{
      return iInscriptionService.findAllInscription();
    }
}
