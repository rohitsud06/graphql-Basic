package com.example.learning.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.learning.demo.dao.impl.MovieDaoImpl;
import com.example.learning.demo.daos.MovieDao;
import com.example.learning.demo.srvc.MovieService;

@Component
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieDao movieDao;

	@Autowired
	MovieDaoImpl movieDaoImpl;
	
	public List<String> getAllMovies() {
		
		List<String> moviedtls = movieDaoImpl.getMovies();
		
		for(String s : moviedtls)
		{
			System.out.println("Movies are : " + s);
		}
		
		return movieDaoImpl.getMovies();
	}

	public int getMovieId(String movie_name)
	{
		return movieDaoImpl.getId(movie_name);
	}
}
