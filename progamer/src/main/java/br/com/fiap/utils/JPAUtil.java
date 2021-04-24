package br.com.fiap.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class JPAUtil {
	
	private static final String PROGAMER_PERSISTENCE_UNIT = "progamer-persistence-unit";

	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory(PROGAMER_PERSISTENCE_UNIT);
		EntityManager manager = factory.createEntityManager();
		return manager;
	}

}
