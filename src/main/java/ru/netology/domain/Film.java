package ru.netology.domain;

public class Film {
    private int id;
    private int filmId;
    private String title;
    private String genre;
    private String release;

    public Film(int id, int filmId, String title, String genre, String release) {
        this.id = id;
        this.filmId = filmId;
        this.title = title;
        this.genre = genre;
        this.release = release;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
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

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
