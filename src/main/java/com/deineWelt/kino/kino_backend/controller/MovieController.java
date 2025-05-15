package com.deineWelt.kino.kino_backend.controller;

import com.deineWelt.kino.kino_backend.dto.MovieDto;
import com.deineWelt.kino.kino_backend.entity.Movie;
import com.deineWelt.kino.kino_backend.mapper.MovieMapper;
import com.deineWelt.kino.kino_backend.repository.MovieRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    public MovieController(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    @GetMapping
    public List<MovieDto> getAllMovies() {
        return movieRepository.findAll()
                .stream()
                .map(movieMapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getMovieById(@PathVariable Long id) {
        return movieRepository.findById(id)
                .map(movieMapper::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieDto createMovie(@RequestBody MovieDto movieDto) {
        Movie movie = movieMapper.toEntity(movieDto);
        Movie saved = movieRepository.save(movie);
        return movieMapper.toDto(saved);
    }


    @PutMapping("/{id}")
    public ResponseEntity<MovieDto> updateMovie(@PathVariable Long id, @RequestBody MovieDto movieDto) {
        return movieRepository.findById(id)
                .map(existingMovie -> {
                    Movie updated = movieMapper.toEntity(movieDto);
                    updated.setId(existingMovie.getId());
                    return ResponseEntity.ok(movieMapper.toDto(movieRepository.save(updated)));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMovie(@PathVariable Long id) {
        movieRepository.deleteById(id);
    }







}
