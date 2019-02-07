package com.example.learning.demo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MovieDaoImpl {

	

	@PersistenceContext
	public EntityManager entityManager;
	
	public List<String> getMovies()
	{
		Query query = entityManager.createQuery("select * from movies");
		
		return query.getResultList();
	}
	
	public int getId(String movie_name)
	{
		Query query = entityManager.createQuery("select MOVIE_ID from Movies where movies.movie_name=:movie_name");
		query.setParameter("moviename", movie_name);
		return query.getFirstResult();
	}
	
}
