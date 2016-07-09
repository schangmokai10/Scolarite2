/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite2.serviceImplements;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.scolarite2.data.Etudiant;
import com.mycompany.scolarite2.dataInterface.IEtudiantDao;
import com.mycompany.scolarite2.serviceInterface.IEtudiantService;
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
public class EtudiantServiceImpl implements IEtudiantService{
     
    IEtudiantDao iEtudiantDao;

    public IEtudiantDao getiEtudiantDao() {
        return iEtudiantDao;
    }

    public void setiEtudiantDao(IEtudiantDao iEtudiantDao) {
        this.iEtudiantDao = iEtudiantDao;
    }

    public Etudiant createEtudiant(Etudiant etudiant) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEtudiantDao.create(etudiant);
        } catch (DataAccessException ex) {
            Logger.getLogger(EtudiantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de dcreate");
        }
    }

    public Etudiant updateEtudiant(Etudiant etudiant) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEtudiantDao.update(etudiant);
        } catch (DataAccessException ex) {
            Logger.getLogger(EtudiantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de dcreate");
        }
    }

    public void deleteEtudiant(Etudiant etudiant) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            iEtudiantDao.delete(etudiant);
        } catch (DataAccessException ex) {
            Logger.getLogger(EtudiantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de dcreate");
        }
    }

    public Etudiant findEtudiantById(Long id) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEtudiantDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(EtudiantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de dcreate");
        }
    }

    public List<Etudiant> findAllEtudiant() throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEtudiantDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(EtudiantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur de dcreate");
        }
    }

    
    
}
