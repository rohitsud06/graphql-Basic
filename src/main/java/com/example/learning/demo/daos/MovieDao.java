package com.example.learning.demo.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learning.demo.model.Movies;





public interface MovieDao extends JpaRepository<Movies, Long>{
	
	List<String> getMovies();
	
	int getId(String movie_name);

}
