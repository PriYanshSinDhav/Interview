package com.example.Interview.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Interview.DTOs.MovieDto;
import com.example.Interview.DTOs.VotesDto;
import com.example.Interview.Entitites.Movies;
import com.example.Interview.Layer.MoviesBL;
import com.example.Interview.Repositories.MoviesRepository;

@Transactional
@Service

public class MoviesService implements MoviesBL {
	
	
	@Autowired
	MoviesRepository moviesRepo;

	@Override
	public List<Movies> getlongestDurationMovies() {
		return moviesRepo.getlongestDurationMovies();
		
	}

	@Override
	public List <MovieDto> getTopRatedMovies() {
		return moviesRepo.getTopRatedMovies();
	}

	@Override
	public void addMovie(Movies movies) {
		moviesRepo.save(movies);
	}

	@Override
	public  void updateRuntime() {
		 moviesRepo.updateRuntime();
	}

	@Override
	public List<VotesDto> genreMovieWithSubTotals() {
		return moviesRepo.genreMovieWithSubTotals();
		
	}
	
	
	

}
