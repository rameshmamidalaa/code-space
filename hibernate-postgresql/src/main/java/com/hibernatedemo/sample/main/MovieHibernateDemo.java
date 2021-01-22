/**
 * 
 */
package com.hibernatedemo.sample.main;

import java.util.Scanner;

import org.hibernate.HibernateException;

import com.hibernatedemo.sample.model.Movie;
import com.hibernatedemo.sample.service.impl.MovieServiceImpl;

/**
 * @author Ramesh_Mamidala
 *
 */

public class MovieHibernateDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("CREATE");
			System.out.println("Add the movie details:::");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the movie name::");
			String movieName = sc.nextLine();
			System.out.println("Enter the movie Language::");
			String movieLanguage = sc.next();
			System.out.println("Enter the releaseIn::");
			int movieRelIn = sc.nextInt();
			System.out.println("Enter the revenue of the movie::");
			Double movieRevenue = sc.nextDouble();
			Movie movie = new Movie();
			movie.setMovieName(movieName);
			movie.setLanguage(movieLanguage);
			movie.setReleasedIn(movieRelIn);
			movie.setRevenueInDollars(movieRevenue);
			MovieServiceImpl movieService = new MovieServiceImpl();
			movieService.addMovie(movie);
			System.out.println("READ");
			System.out.println("Get the movie details:::");
			int getMovieId = sc.nextInt();
			movieService.getMovie(getMovieId);
			sc.close();
			
		} catch(HibernateException hbe) {
			hbe.printStackTrace();
		}
		

	}

}
