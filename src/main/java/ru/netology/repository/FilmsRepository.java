package ru.netology.repository;

import ru.netology.domain.Film;

public class FilmsRepository {
    private Film[] films = new Film[0];
    protected int resultLength;
    private int maxLength = 10;

    public void save(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public FilmsRepository() {
        this.maxLength = 10;
    }

    public FilmsRepository(int maxLength) {
        if (maxLength <= this.maxLength) {
            this.maxLength = maxLength;
        }


    }

    public Film[] findLast() {
        Film[] all = films;
        if (resultLength <= films.length) {
            resultLength = maxLength;
        } else {
            resultLength = films.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }


}
