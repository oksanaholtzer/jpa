


import java.util.List;

import javax.persistence.*;

import entity.Artiste;
import entity.Manager;
import entity.Media;
import entity.MediaType;



public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("trJPA");
		EntityManager em =  emfactory.createEntityManager();
		
		
		
		EntityTransaction transaction =em.getTransaction() ;
		try {
		transaction.begin();
		Artiste artiste= new Artiste ("10", "Test", "test");
		em.persist(artiste);
		Manager manager =new Manager ("1","testManager", "prenom");
		em.persist(manager);
		 manager.addArtiste(artiste);
		 
		 for(int i=0;i<15; i++) {
			 manager.addArtiste(new Artiste (""+i,"Virginie","test"));
		 }
		 
		 em.find(Manager.class , "1");
		 Query query =  em.createQuery("from Artiste artiste where artiste.lastname=:lname");
		 query.setParameter("lname", "test");
		 
		 List <Artiste> artistes=query.getResultList();
		 
		 Query nQuery=em.createNamedQuery("findArtisteByName");
		
		
		Media media1 = new Media ("media1", MediaType.CD);
		
		transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		em.close();
		emfactory.close();

    }
}
