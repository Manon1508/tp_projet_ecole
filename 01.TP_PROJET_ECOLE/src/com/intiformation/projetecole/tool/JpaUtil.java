package com.intiformation.projetecole.tool;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

/**
 * Utilitaire qui permet de r�cup�rer une entity manager
 * @author IN-BR-026
 *
 */
public class JpaUtil {
	
	private static EntityManager entityManager;
	private static String pu_name = "03_hibernate_mapping-annotation-jpa_entityManager";
	
	/**
	 * R�cup une entityManager
	 * @return
	 */
	public static EntityManager getInstance() {
		
		if (entityManager == null) {
			
			try {
				
				entityManager = Persistence.createEntityManagerFactory(pu_name).createEntityManager();
				
				
			} catch (PersistenceException e) {
				System.out.println("la cr�ation de l'entity manager � �chou�e");
				e.printStackTrace();
			}
		}// end if
		
		return entityManager;
		
	}// end EntityManager

}//end class
