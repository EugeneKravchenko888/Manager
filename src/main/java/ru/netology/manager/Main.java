package ru.netology.manager;
import ru.netology.domain.Films;

public class Main {

    public static void main(String[] args) {

        Films film1 = new Films(101, 1, "Бладшот - Начало.", 500, 2);
        Films film2 = new Films(102, 2, "Вперёд", 500, 2);
        Films film3 = new Films(103, 3, "Отель Белград", 500, 2);
        Films film4 = new Films(104, 4, "Джентльмены", 700, 2);
        Films film5 = new Films(105, 5, "Человек-невидимка", 300, 2);
        Films film6 = new Films(106, 6, "Тролли.Мировой тур", 500, 6);
        Films film7 = new Films(107, 7, "Номер один", 500, 1);


        FilmsManager manager = new FilmsManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);


        Films[] all = manager.findLast();//Отдает в обратном порядке.

    }

}