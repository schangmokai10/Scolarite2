/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceImplements;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.scolarite2.data.Filiere;
import com.mycompany.scolarite2.dataInterface.IFiliereDao;
import com.mycompany.scolarite2.serviceInterface.IFiliereService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mounirah
 */
@Transactional
public class FiliereServiceImpl implements IFiliereService{
     IFiliereDao iFiliereDao;

    public IFiliereDao getiFiliereDao() {
        return iFiliereDao;
    }

    public void setiFiliereDao(IFiliereDao iFiliereDao) {
        this.iFiliereDao = iFiliereDao;
    }

    public Filiere createFiliere(Filiere filiere) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            return iFiliereDao.create(filiere);
        } catch (DataAccessException ex) {
            Logger.getLogger(FiliereServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la creation de filiere");
        }
    }

    public Filiere updateFiliere(Filiere filiere) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet.");
             return iFiliereDao.update(filiere);
        } catch (DataAccessException ex) {
            Logger.getLogger(FiliereServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la mis a jour de filiere"); 
        }
    }

    public void deleteFiliere(Filiere filiere) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            iFiliereDao.delete(filiere);
        } catch (DataAccessException ex) {
            Logger.getLogger(FiliereServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la suppression filiere");
        }
    }

    public Filiere findFiliereById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            return iFiliereDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(FiliereServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la recherche filiere");
        }
    }

    public List<Filiere> findAllFiliere() throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet.");
             return iFiliereDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(FiliereServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la recherche filiere");
        }
        
    }



    
    
}
