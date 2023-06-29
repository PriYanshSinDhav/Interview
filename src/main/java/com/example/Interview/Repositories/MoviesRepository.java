package com.example.Interview.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Interview.DTOs.MovieDto;
import com.example.Interview.DTOs.VotesDto;
import com.example.Interview.Entitites.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, String> {

@Query(value = " select TOP 10 * from movies order by runtimeMinutes desc ", nativeQuery = true)	
public List<Movies> getlongestDurationMovies ();

@Query(name = "getTopRatedMovies",nativeQuery = true)
public List<MovieDto> getTopRatedMovies();


@Modifying
@Query(value ="update Movies set runtimeMinutes = case[genres] when 'Documentary' then runtimeMinutes+15 when 'Animation' then runtimeMinutes+30  else  runtimeMinutes + 45 END",nativeQuery = true)
public  void updateRuntime();

@Query(name = "getGenreMovieWithSubTotals",nativeQuery = true)
public List<VotesDto> genreMovieWithSubTotals();

}
