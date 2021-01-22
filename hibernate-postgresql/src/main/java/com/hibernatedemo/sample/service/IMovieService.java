/**
 * 
 */
package com.hibernatedemo.sample.service;

import com.hibernatedemo.sample.model.Movie;

/**
 * @author Ramesh_Mamidala
 *
 */
public interface IMovieService {
	Integer addMovie(Movie movie) throws Exception;
	Movie getMovie(Integer movieId);
	void updateMovie(Integer movieId);
	void deleteMovie(Integer movieId);
	
}
