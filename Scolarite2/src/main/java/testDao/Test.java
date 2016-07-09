/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testDao;

import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import com.mycompany.scolarite2.data.Etudiant;
import com.mycompany.scolarite2.dataImplements.EtudiantDaoImpl;
import com.mycompany.scolarite2.dataInterface.IEtudiantDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Mounirah
 */
public class Test {
      public static void main(String[] args) throws DataAccessException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("scolaritePU");
        EntityManager em = emf.createEntityManager();
        IEtudiantDao iEtudiantDao = new EtudiantDaoImpl();
        ((GenericDao) iEtudiantDao).setManager(em);
        System.out.println("hello");
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Djam-doudou");
        etudiant.setPrenom("Mounirah");
        iEtudiantDao.create(etudiant);
        tx.commit();
            
       
    }
}
