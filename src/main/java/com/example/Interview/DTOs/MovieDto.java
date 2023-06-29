package com.example.Interview.DTOs;

import javax.persistence.Column;
import javax.persistence.Id;

public class MovieDto {
	

	
	public MovieDto(String tconst, String primaryTitle, String genres, float averageRating) {
		super();
		this.tconst = tconst;
		this.primaryTitle = primaryTitle;
		this.genres = genres;
		this.averageRating = averageRating;
	}

	private String tconst;
	
	private String primaryTitle;
	
	private String genres;
	
	private float averageRating;

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}
	
	

}
