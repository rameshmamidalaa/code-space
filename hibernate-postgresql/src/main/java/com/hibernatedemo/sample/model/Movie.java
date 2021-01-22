/**
 * 
 */
package com.hibernatedemo.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ramesh_Mamidala
 *
 * It is an entity class for the <Code>Movie</code> object and it is used to map with the corresponding database table.
 */
@Entity
@Table(name= "movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "movie_seq_gen")
	@SequenceGenerator(name = "movie_seq_gen", sequenceName = "movie_id_seq",allocationSize=1)
	@Column(name = "movieid", updatable= false, nullable = false)
	Integer movieId;
	@Column(name = "moviename", nullable = false)
	String movieName;
	@Column(name = "movielanguage", nullable = false)
	String language;
	@Column(name = "moviereleasedin")
	Integer releasedIn;
	@Column(name= "movierevenue")
	Double revenueInDollars;

}
