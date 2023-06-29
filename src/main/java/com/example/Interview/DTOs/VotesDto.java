package com.example.Interview.DTOs;

public class VotesDto {
	

	public VotesDto(String primaryTitle, String genres, long votes) {
		super();
		this.primaryTitle = primaryTitle;
		this.genres = genres;
		this.votes = votes;
	}

	private String primaryTitle;
	
	private String genres;
	
	private long votes;

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

	public long getVotes() {
		return votes;
	}

	public void setVotes(long votes) {
		this.votes = votes;
	}
	
	


}
