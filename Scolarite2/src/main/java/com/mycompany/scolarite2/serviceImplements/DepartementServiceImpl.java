/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceImplements;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.scolarite2.data.Departement;
import com.mycompany.scolarite2.dataInterface.IDepartementDao;
import com.mycompany.scolarite2.serviceInterface.IDepartementService;
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
public class DepartementServiceImpl implements IDepartementService{
     IDepartementDao iDepartementDao;

    public IDepartementDao getiDepartementDao() {
        return iDepartementDao;
    }

    public void setiDepartementDao(IDepartementDao iDepartementDao) {
        this.iDepartementDao = iDepartementDao;
    }

    public Departement createDepartement(Departement departement) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            return iDepartementDao.create(departement);
        } catch (DataAccessException ex) {
            Logger.getLogger(DepartementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la creation de departement");
        }
    }

    public Departement updateDepartement(Departement departement) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet.");
             return iDepartementDao.update(departement);
        } catch (DataAccessException ex) {
            Logger.getLogger(DepartementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la mis a jour de departement"); 
        }
    }

    public void deleteDepartement(Departement departement) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            iDepartementDao.delete(departement);
        } catch (DataAccessException ex) {
            Logger.getLogger(DepartementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la suppression departement");
        }
    }

    public Departement findDepartementById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet.");
            return iDepartementDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(DepartementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la recherche departement");
        }
    }

    public List<Departement> findAllDepartement() throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet.");
             return iDepartementDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(DepartementServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("Erreur lors de la recherche departement");
        }
        
    }
    
    
}
