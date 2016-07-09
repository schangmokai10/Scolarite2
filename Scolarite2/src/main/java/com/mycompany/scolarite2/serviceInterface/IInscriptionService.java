/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceInterface;

import com.mycompany.scolarite2.data.Inscription;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mounirah
 */
@Transactional
public interface IInscriptionService {
    
    public Inscription createInscription(Inscription inscription) throws ServiceException;

    public Inscription updateInscription(Inscription inscription) throws ServiceException;// mis a jour

    public void deleteInscription(Inscription inscription) throws ServiceException;

    public Inscription findInscriptionById(Long id) throws ServiceException; // rechercher par id. de type long id

    public List<Inscription> findAllInscription() throws ServiceException;// recherche tt les enseignants de la bd. ca retourne 1e liste denseignant

    
}
