/**
 * 
 */
package com.hibernatedemo.sample.service.impl;

import com.hibernatedemo.sample.dao.MovieDao;
import com.hibernatedemo.sample.model.Movie;
import com.hibernatedemo.sample.service.IMovieService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Ramesh_Mamidala
 *
 */
@Slf4j
public class MovieServiceImpl implements IMovieService {
	MovieDao movieDao = new MovieDao();

	public Integer addMovie(Movie movie) throws Exception {
		log.info("In MovieServiceImpl::::::::::");
		Integer movieId = movieDao.addMovie(movie);
		return movieId;
	}

	public Movie getMovie(Integer movieId) {
		return movieDao.getMovie(movieId);
		
	}

	public void updateMovie(Integer movieId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteMovie(Integer movieId) {
		// TODO Auto-generated method stub
		
	}

}
