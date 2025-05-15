package com.deineWelt.kino.kino_backend.mapper;
import com.deineWelt.kino.kino_backend.entity.Movie;
import com.deineWelt.kino.kino_backend.dto.MovieDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    MovieDto toDto(Movie movie);
    Movie toEntity(MovieDto dto);
}
