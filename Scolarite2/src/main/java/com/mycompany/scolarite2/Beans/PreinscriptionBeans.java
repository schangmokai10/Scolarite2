/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.Beans;

import com.mycompany.scolarite2.data.Prinscription;
import com.mycompany.scolarite2.serviceInterface.IPrinscriptionService;
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
public class PreinscriptionBeans {
    @ManagedProperty(value = "#{IPrinscriptionService}")
    IPrinscriptionService iPrinscriptionService;
    
    Prinscription prinscription = new Prinscription();

    public PreinscriptionBeans() {
    }

    public IPrinscriptionService getiPrinscriptionService() {
        return iPrinscriptionService;
    }

    public void setiPrinscriptionService(IPrinscriptionService iPrinscriptionService) {
        this.iPrinscriptionService = iPrinscriptionService;
    }

    public Prinscription getPrinscription() {
        return prinscription;
    }

    public void setPrinscription(Prinscription prinscription) {
        this.prinscription = prinscription;
    }
    
    public Prinscription createPrinscription() throws ServiceException{
      return iPrinscriptionService.createPrinscription(prinscription);
    
    }

    public Prinscription updatePrinscription() throws ServiceException{
      return iPrinscriptionService.updatePrinscription(prinscription);
    }

    public void deletePrinscription() throws ServiceException{
      iPrinscriptionService.deletePrinscription(prinscription);
    }

    public Prinscription findPrinscriptionById(Long id) throws ServiceException{
      return iPrinscriptionService.findPrinscriptionById(prinscription.getId());
    }

     public List<Prinscription> findAllPrinscription() throws ServiceException{
       return iPrinscriptionService.findAllPrinscription();
     }
    
}
