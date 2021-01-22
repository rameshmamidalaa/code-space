/**
 * 
 */
package com.hibernatedemo.sample.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernatedemo.sample.model.Movie;
import com.hibernatedemo.sample.util.HibernateUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ramesh_Mamidala
 *
 */
@Slf4j
public class MovieDao {
	/**
	 * @param movie
	 * @return movieId
	 */
	public Integer addMovie(Movie movie) throws Exception {
		log.info("In addMovie of MovieDao::::::::::");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Integer movieId = (Integer)session.save(movie);
		log.info("Created movie with id: {}"+movieId);
		tx.commit();
		return movieId;
		
	}
	public Movie getMovie(Integer movieId ) {
		log.info("In getMovie of MovieDao::::::::::");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Movie movie = session.get(Movie.class, movieId);
		log.info("Get the details of "+movieId+":"+movie);
		tx.commit();
		return movie;
	}
}
