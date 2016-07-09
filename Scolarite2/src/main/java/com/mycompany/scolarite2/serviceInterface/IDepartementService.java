/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceInterface;
import org.hibernate.service.spi.ServiceException;
import com.mycompany.scolarite2.data.Departement;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mounirah
 */
@Transactional
public interface IDepartementService {
    
    public Departement createDepartement(Departement departement) throws ServiceException;

    public Departement updateDepartement(Departement departement) throws ServiceException;// mis a jour

    public void deleteDepartement(Departement departement) throws ServiceException;

    public Departement findDepartementById(Long id) throws ServiceException; // rechercher par id. de type long id

    public List<Departement> findAllDepartement() throws ServiceException;// recherche tt les enseignants de la bd. ca retourne 1e liste denseignant

    
}
