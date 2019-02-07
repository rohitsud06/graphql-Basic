package com.example.learning.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table/*(name = "Movies")*/
public class Movies implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String movie_name;

	@Id
	private int movie_id;

	private int movie_release_year;

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public int getMovie_release_year() {
		return movie_release_year;
	}

	public void setMovie_release_year(int movie_release_year) {
		this.movie_release_year = movie_release_year;
	}

}
