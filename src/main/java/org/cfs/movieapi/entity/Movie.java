package org.cfs.movieapi.entity;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private float rating;

    Movie(){

    }
    public Movie(Long id, String title, String genre, int releaseYear, float rating){
        this.id=id;
        this.title=title;
        this.genre=genre;
        this.releaseYear=releaseYear;
        this.rating=rating;
    }

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
