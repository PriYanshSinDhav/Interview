package com.example.Interview.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Interview.Entitites.Ratings;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, String> {

}
