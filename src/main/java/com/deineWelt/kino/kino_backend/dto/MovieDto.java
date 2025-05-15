package com.deineWelt.kino.kino_backend.dto;

import com.deineWelt.kino.kino_backend.enums.AgeRating;

import java.time.LocalDate;

public class MovieDto {

    private Long id;
    private String title;
    private String description;
    private int genre;
    private LocalDate releaseDate;
    private AgeRating ageRating;
    private String language;
    private String imageUrl;


    public MovieDto(Long id, String title, String description, int genre, LocalDate releaseDate, AgeRating ageRating,
                    String language, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.ageRating = ageRating;
        this.language = language;
        this.imageUrl = imageUrl;
    }


    public MovieDto() {
    }


    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public AgeRating getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(AgeRating ageRating) {
        this.ageRating = ageRating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
