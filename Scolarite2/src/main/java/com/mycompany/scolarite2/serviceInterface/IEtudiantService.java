/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceInterface;
import org.hibernate.service.spi.ServiceException;
import com.mycompany.scolarite2.data.Etudiant;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Mounirah
 */
@Transactional
public interface IEtudiantService {
    
    public Etudiant createEtudiant(Etudiant etudiant) throws ServiceException;

    public Etudiant updateEtudiant(Etudiant etudiant) throws ServiceException;// mis a jour

    public void deleteEtudiant(Etudiant etudiant) throws ServiceException;

    public Etudiant findEtudiantById(Long id) throws ServiceException; // rechercher par id. de type long id

    public List<Etudiant> findAllEtudiant() throws ServiceException;// recherche tt les enseignants de la bd. ca retourne 1e liste denseignant

    
}
