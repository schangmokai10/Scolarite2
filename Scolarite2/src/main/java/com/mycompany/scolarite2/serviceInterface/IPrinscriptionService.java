/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceInterface;

import com.mycompany.scolarite2.data.Prinscription;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mounirah
 */
@Transactional
public interface IPrinscriptionService {
    public Prinscription createPrinscription(Prinscription prinscription) throws ServiceException;

    public Prinscription updatePrinscription(Prinscription prinscription) throws ServiceException;// mis a jour

    public void deletePrinscription(Prinscription prinscription) throws ServiceException;

    public Prinscription findPrinscriptionById(Long id) throws ServiceException; // rechercher par id. de type long id

     public List<Prinscription> findAllPrinscription() throws ServiceException;// recherche tt les enseignants de la bd
}
