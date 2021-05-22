package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.fiap.model.User;
import br.com.fiap.utils.JPAUtil;

public class UserDAO {

	public void save(User user) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.close();
		
	}

	public List<User> getAll() {
		EntityManager manager = JPAUtil.getEntityManager();
		String jpql = "SELECT u FROM User u";
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		return query.getResultList();		
	}

	public boolean exist(User user) {
		EntityManager manager = JPAUtil.getEntityManager();
		TypedQuery<User> query = manager.createQuery(
				"SELECT u FROM User u WHERE "
				+ "u.email = :email AND "
				+ "u.password = :password", User.class);
		query.setParameter("email", user.getEmail());
		query.setParameter("password", user.getPassword());
		
		try {
			query.getSingleResult();
		} catch (NoResultException e) {
			return false;
		}
		
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
