package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model.Setup;

public class SetupDAO {

	public void save(Setup setup) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("progamer-persistence-unit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		
		manager.close();
		
	}

}
