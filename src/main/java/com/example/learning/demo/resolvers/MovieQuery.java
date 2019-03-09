package com.example.learning.demo.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.learning.demo.model.Movies;
import com.example.learning.demo.srvc.MovieService;

@Component
public class MovieQuery implements GraphQLQueryResolver {

	@Autowired
	MovieService movieService;

	public List<Movies> getMovies() {
		return movieService.getMovies();
	}

}
