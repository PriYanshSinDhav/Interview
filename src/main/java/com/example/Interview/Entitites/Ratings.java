package com.example.Interview.Entitites;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;


@Entity
public class Ratings {
	
	
	@Id
	@Column(name = "tconst")
	private String tconst;
	@Column(name = "averageRating")
	private float averageRating;
	@Column(name = "numVotes")
	private long numVotes;

}
