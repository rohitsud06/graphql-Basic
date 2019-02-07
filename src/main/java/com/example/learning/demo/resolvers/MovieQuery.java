package com.example.learning.demo.resolvers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.learning.demo.service.impl.MovieServiceImpl;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

@Component
public class MovieQuery implements GraphQLQueryResolver{
	

	
	@Autowired
	MovieServiceImpl movieServiceImpl;

	public int getMovieId(String movie_name)
	{
		return movieServiceImpl.getMovieId(movie_name);
	}
	
}
