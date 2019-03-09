package com.example.learning.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movies  {
	
	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "MOVIENAME")
	private String movieName;
	
	@Column(name = "YEAROFRELEASE")
	private String yearOfRelease;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @return the yearOfRelease
	 */
	public String getYearOfRelease() {
		return yearOfRelease;
	}

	/**
	 * @param yearOfRelease the yearOfRelease to set
	 */
	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	
	

}
