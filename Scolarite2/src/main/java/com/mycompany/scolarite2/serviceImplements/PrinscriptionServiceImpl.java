/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceImplements;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.scolarite2.data.Prinscription;
import com.mycompany.scolarite2.dataInterface.IPrinscriptionDao;
import com.mycompany.scolarite2.serviceInterface.IPrinscriptionService;
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
public class PrinscriptionServiceImpl implements IPrinscriptionService{
    
    IPrinscriptionDao iPrinscriptionDao;

    public IPrinscriptionDao getiPrinscriptionDao() {
        return iPrinscriptionDao;
    }

    public void setiPrinscriptionDao(IPrinscriptionDao iPrinscriptionDao) {
        this.iPrinscriptionDao = iPrinscriptionDao;
    }

    public Prinscription createPrinscription(Prinscription prinscription) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            return iPrinscriptionDao.create(prinscription);
        } catch (DataAccessException ex) {
            Logger.getLogger(PrinscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la creation de prinscription");
        }
    }

    public Prinscription updatePrinscription(Prinscription prinscription) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet.");
             return iPrinscriptionDao.update(prinscription);
        } catch (DataAccessException ex) {
            Logger.getLogger(PrinscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la mis a jour de prinscription"); 
        }
    }

    public void deletePrinscription(Prinscription prinscription) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            iPrinscriptionDao.delete(prinscription);
        } catch (DataAccessException ex) {
            Logger.getLogger(PrinscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la suppression prinscription");
        }
    }

    public Prinscription findPrinscriptionById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            return iPrinscriptionDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(PrinscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la recherche prinscription");
        }
    }

    public List<Prinscription> findAllPrinscription() throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet.");
             return iPrinscriptionDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(PrinscriptionServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la recherche prinscription");
        }
        
    }
    
    
    
}
