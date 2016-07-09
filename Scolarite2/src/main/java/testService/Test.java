/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testService;

import com.mycompany.scolarite2.data.Etudiant;
import com.mycompany.scolarite2.serviceInterface.IEtudiantService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Mounirah
 */
                                                                                                
public class Test {
    public static void main(String[] args) throws ServiceException {
        System.out.println( "Hello World!" );    
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:Spring-Config.xml");    
        IEtudiantService iEtudiantService = ctx.getBean("IEtudiantService", IEtudiantService.class);
        Etudiant etudiant = iEtudiantService.findEtudiantById(1L);
        etudiant.setPrenom("mouni");
        iEtudiantService.updateEtudiant(etudiant);
        //new Enseignant();
//        enseignant.setNom("Djamdoudou");
//        enseignant.setPrenom("Fadimatou");
       // iEnseignantService.createEnseignant(enseignant);

        
    }

    
}
