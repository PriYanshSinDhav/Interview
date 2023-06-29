package com.example.Interview.Entitites;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.example.Interview.DTOs.MovieDto;
import com.example.Interview.DTOs.VotesDto;

@NamedNativeQuery(
		name="getTopRatedMovies",
		query = "select m.tconst as tconst ,m.primaryTitle as primaryTitle ,m.genres as genres ,r.averageRating as averageRating from Movies m join Ratings r on m.tconst=r.tconst where r.averageRating>6.0 ",
		resultSetMapping = "TopRatedMovies"		
		)
@SqlResultSetMapping(
		name = "TopRatedMovies",
		classes = @ConstructorResult(
				targetClass = MovieDto.class,
				columns = {
						@ColumnResult(name = "tconst",type =String.class ),
						@ColumnResult(name = "primarytitle",type =String.class ),
						@ColumnResult(name = "genres", type = String.class ),
						@ColumnResult(name="averagerating", type=Float.class)
				}
				)
		
		)
@NamedNativeQuery(
		name="getGenreMovieWithSubTotals",
		query = "select m.genres as genres, m.primaryTitle as primarytitle , sum(numVotes) as votes from movies m join Ratings r on r.tconst=m.tconst group by RollUP(genres,primaryTitle)",
		resultSetMapping = "GenreMovieWithSubTotals"		
		)
@SqlResultSetMapping(
		name = "GenreMovieWithSubTotals",
		classes = @ConstructorResult(
				targetClass = VotesDto.class,
				columns = {
						@ColumnResult(name = "primarytitle",type =String.class ),
						@ColumnResult(name = "genres", type = String.class ),
						@ColumnResult(name = "votes",type =Long.class )
				}
				)
		
		)
@Entity
@Table(name = "Movies")
public class Movies {
	
	@Id
	@Column(name = "TCONST" )
	private String tconst;
	
	@Column(name = "TITLETYPE" )
	private String titleType;
	
	@Column(name = "PRIMARYTITLE" )
	private String primaryTitle;
	
	@Column(name = "RUNTIMEMINUTES" )
	private long runtimeMinutes;
	
	@Column(name = "GENRES" )
	private String genres;

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public long getRuntimeMinutes() {
		return runtimeMinutes;
	}

	public void setRuntimeMinutes(long runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}
	
	
}
