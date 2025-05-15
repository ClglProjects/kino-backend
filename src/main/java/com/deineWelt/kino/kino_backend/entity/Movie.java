package com.deineWelt.kino.kino_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import com.deineWelt.kino.kino_backend.enums.AgeRating;
@Entity
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private AgeRating ageRating;
    private int genre;
    private LocalDate releaseDate;



    private String language;

    private String imageUrl;

    public Movie() {
    }

    public Movie(String title, String description, int genre, LocalDate releaseDate, AgeRating ageRating, String language, String imageUrl) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.ageRating = ageRating;
        this.language = language;
        this.imageUrl = imageUrl;
    }





    // Getter & Setter für alle Felder
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getGenre() { return genre; }

    public void setGenre(int genre) { this.genre = genre; }

    public LocalDate getReleaseDate() { return releaseDate; }

    public void setReleaseDate(LocalDate releaseDate) { this.releaseDate = releaseDate; }

    public AgeRating getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(AgeRating ageRating) {
        this.ageRating = ageRating;
    }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public String getImageUrl() { return imageUrl; }

    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
