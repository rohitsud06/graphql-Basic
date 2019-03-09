package com.example.learning.demo.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learning.demo.model.Movies;

@Repository
public interface MovieDao extends JpaRepository<Movies, Long> {

}
