package com.example.learning.demo.srvc;

import java.util.List;

public interface MovieService {
	
	public List<String> getAllMovies();
	
	public int getMovieId(String movie_name);

}
