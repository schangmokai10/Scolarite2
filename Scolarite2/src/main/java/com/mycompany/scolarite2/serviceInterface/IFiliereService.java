/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceInterface;

import com.mycompany.scolarite2.data.Filiere;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mounirah
 */
@Transactional
public interface IFiliereService {
    
    public Filiere createFiliere(Filiere filiere) throws ServiceException;

    public Filiere updateFiliere(Filiere filiere) throws ServiceException;// mis a jour

    public void deleteFiliere(Filiere filiere) throws ServiceException;

    public Filiere findFiliereById(Long id) throws ServiceException; // rechercher par id. de type long id

    public List<Filiere> findAllFiliere() throws ServiceException;// recherche tt les enseignants de la bd. ca retourne 1e liste denseignant

    
}
