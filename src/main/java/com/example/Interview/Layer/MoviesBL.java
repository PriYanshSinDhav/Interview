package com.example.Interview.Layer;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.Interview.DTOs.MovieDto;
import com.example.Interview.DTOs.VotesDto;
import com.example.Interview.Entitites.Movies;

public interface MoviesBL {
	
	public List<Movies> getlongestDurationMovies();
	
	public List<MovieDto> getTopRatedMovies(); 
	
	public void addMovie(Movies movies);
	
	public  void updateRuntime(); 
	
	public List<VotesDto> genreMovieWithSubTotals(); 
}
