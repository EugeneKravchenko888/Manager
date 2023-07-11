package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.*;


class FilmsManagerTest {
    Films film1 = new Films(101, 1, "Бладшот - Начало.", 500, 2);
    Films film2 = new Films(102, 2, "Вперёд", 500, 2);
    Films film3 = new Films(103, 3, "Отель Белград", 500, 2);
    Films film4 = new Films(104, 4, "Джентльмены", 700, 2);
    Films film5 = new Films(105, 5, "Человек-невидимка", 300, 2);
    Films film6 = new Films(106, 6, "Тролли.Мировой тур", 500, 6);
    Films film7 = new Films(107, 7, "Номер один", 500, 1);

    @Test
    public void test1FindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        Films[] actual = manager.findLast();
        Films[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2FindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);

        Films[] actual = manager.findLast();
        Films[] expected = {film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test3FindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        Films[] actual = manager.findLast();
        Films[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test4FindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);

        Films[] actual = manager.findLast();
        Films[] expected = {film6, film5, film4, film3, film2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test5FindLast() {
        FilmsManager manager = new FilmsManager();

        Films[] actual = manager.findLast();
        Films[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindAll() {
        FilmsManager manager = new FilmsManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        Films[] actual = manager.findAll();
        Films[] expected = {film1, film2, film3, film4, film5, film6, film7};

        assertArrayEquals(actual, expected);
    }

}