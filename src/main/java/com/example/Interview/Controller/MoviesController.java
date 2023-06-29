package com.example.Interview.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.DTOs.MovieDto;
import com.example.Interview.DTOs.VotesDto;
import com.example.Interview.Entitites.Movies;
import com.example.Interview.Layer.MoviesBL;

@RestController
@CrossOrigin("*")
@RequestMapping
public class MoviesController {
	
	@Autowired
	MoviesBL moviesbl;
	
	
	@GetMapping("/longest-duration-movies")
	public List<Movies> getlongestDurationMovies() 
	{
		return moviesbl.getlongestDurationMovies();
	}
	
	@PostMapping("/new-movie")
	public void addMovie(@RequestBody Movies movie) 
	{
		moviesbl.addMovie(movie);
	}
	
	@GetMapping("/top-rated-movies")
	public List<MovieDto> getTopRatedMovies() 
	{
		return moviesbl.getTopRatedMovies();
		
	}

	
	@GetMapping("/genre-movies-with-subtotals")
	public List<VotesDto> genreMovieWithSubTotals() 
	{
		return moviesbl.genreMovieWithSubTotals();
	}
	
	@GetMapping("/update-runtime-minute")
	public  void updateRuntime() 
	{
		 moviesbl.updateRuntime();
	}
}
