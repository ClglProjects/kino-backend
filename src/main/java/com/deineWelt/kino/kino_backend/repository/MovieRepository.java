package com.deineWelt.kino.kino_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deineWelt.kino.kino_backend.entity.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long>{


        }