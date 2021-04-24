package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Setup;
import br.com.fiap.utils.JPAUtil;

public class SetupDAO {

	public void save(Setup setup) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(setup);
		manager.getTransaction().commit();
		
		manager.close();
		
	}

	public List<Setup> getAll() {
		EntityManager manager = JPAUtil.getEntityManager();
		String jpql = "SELECT s FROM Setup s";
		TypedQuery<Setup> query = manager.createQuery(jpql, Setup.class);
		return query.getResultList();		
	}
	
	
	
	
	
	
	
	
	
	
	

}
