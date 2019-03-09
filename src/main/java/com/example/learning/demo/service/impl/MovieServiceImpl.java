package com.example.learning.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.demo.daos.MovieDao;
import com.example.learning.demo.model.Movies;
import com.example.learning.demo.srvc.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao movieDao;

	public List<Movies> getMovies() {

		List<Movies> getMovieDetailsList = null;
		try {
			getMovieDetailsList = movieDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getMovieDetailsList;
	}

}
