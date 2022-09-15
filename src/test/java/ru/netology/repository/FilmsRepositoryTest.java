package ru.netology.repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
public class FilmsRepositoryTest {
    Film film1 = new Film(1, 225, "Бладшот", "боевик", "03.03.2022");
    Film film2 = new Film(2, 869, "Вперед", "мультфильм", "05.03.2022");
    Film film3 = new Film(3, 6878, "Отель 'Белград'", "комедия", "05.03.2022");
    Film film4 = new Film(4, 897, "Джентельмены", "боевик", "10.03.2022");
    Film film5 = new Film(5, 2723, "Человек-невидимка", "ужасы", "10.03.2022");
    Film film6 = new Film(6, 2626, "Тролли.Мировой тур", "ультфильм", "11.03.2022");
    Film film7 = new Film(7, 785, "Номер один", "комедия", "13.03.2022");
    Film film8 = new Film(8, 369, "Мистер Бин", "комедия", "14.03.2022");
    Film film9 = new Film(9, 258, "Футурама", "мультфильм", "22.03.2022");
    Film film10 = new Film(10, 963, "Челюсти", "ужасы", "22.03.2022");
    Film film11 = new Film(11, 123, "Крепкий орешек", "боевик", "25.03.2022");

    @Test
    public void shouldAll() {

        FilmsRepository repo = new FilmsRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);

        Film[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldReversed() {
        FilmsRepository repo = new FilmsRepository(3);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);

        Film[] expected = {film11, film10, film9};
        Film[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedEmpty() {
        FilmsRepository repo = new FilmsRepository(0);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);

        Film[] expected = {};
        Film[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedSingle() {
        FilmsRepository repo = new FilmsRepository(1);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);

        Film[] expected = {film11};
        Film[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedMoreThanMaximum() {
        FilmsRepository repo = new FilmsRepository(11);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);

        Film[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Film[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOneLessThanTheMaximum() {
        FilmsRepository repo = new FilmsRepository(8);
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);

        Film[] expected = {film11, film10, film9, film8, film7, film6, film5, film4};
        Film[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldReversedDefault() {
        FilmsRepository repo = new FilmsRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);
        repo.save(film8);
        repo.save(film9);
        repo.save(film10);
        repo.save(film11);

        Film[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Film[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }


}
