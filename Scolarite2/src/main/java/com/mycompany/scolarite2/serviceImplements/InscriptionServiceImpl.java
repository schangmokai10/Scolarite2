/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceImplements;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.scolarite2.data.Inscription;
import com.mycompany.scolarite2.dataInterface.IInscriptionDao;
import com.mycompany.scolarite2.serviceInterface.IInscriptionService;
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
public class InscriptionServiceImpl implements IInscriptionService{
     IInscriptionDao iInscriptionDao;

    public IInscriptionDao getiInscriptionDao() {
        return iInscriptionDao;
    }

    public void setiInscriptionDao(IInscriptionDao iInscriptionDao) {
        this.iInscriptionDao = iInscriptionDao;
    }

    public Inscription createInscription(Inscription inscription) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            return iInscriptionDao.create(inscription);
        } catch (DataAccessException ex) {
            Logger.getLogger(InscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la creation de inscription");
        }
    }

    public Inscription updateInscription(Inscription inscription) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet.");
             return iInscriptionDao.update(inscription);
        } catch (DataAccessException ex) {
            Logger.getLogger(InscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la mis a jour de inscription"); 
        }
    }

    public void deleteInscription(Inscription inscription) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            iInscriptionDao.delete(inscription);
        } catch (DataAccessException ex) {
            Logger.getLogger(InscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la suppression inscription");
        }
    }

    public Inscription findInscriptionById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            return iInscriptionDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(InscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la recherche inscription");
        }
    }

    public List<Inscription> findAllInscription() throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet.");
             return iInscriptionDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(InscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la recherche inscription");
        }
        
    }

    
}
