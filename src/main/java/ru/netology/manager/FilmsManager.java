package ru.netology.manager;
import ru.netology.domain.Films;

public class FilmsManager {
    private Films[] playbill = new Films[0];
    private final int limit;
    public FilmsManager() {
        limit = 5;
    }
    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void add(Films item) {
        int length = playbill.length + 1;//Длинна нового массива.
        Films[] tmp = new Films[length];//Создаеться новый массив.____[length]
        System.arraycopy(playbill, 0, tmp, 0, playbill.length);  //Playbill - откуда копируем. srcPos - с какой позиции копируем. tmp - куда копируем. desPos - с какой позиции копируем. playbill.length - сколько копируем.
        int lastIndex = tmp.length - 1; // Кладем из старого массива в новый. Вычесляет ячейку которая не заполнена.
        tmp[lastIndex] = item;
        playbill = tmp;
    }

    public Films[] findLast() { //Добавления в обратном порядке.
        Films[] playbill = findAll();
        Films[] result;
        if (limit < playbill.length) {
            result = new Films[limit];
        } else {
            result = new Films[playbill.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = playbill.length - i - 1; //массив(playbill.length). Ячейка куда хотим скопировать(i) и минус один (Потому что начинаеться с нуля).
            result[i] = playbill[index];
        }
        return result;
    }
    public Films[] findAll() { //Вывод всех фильмов в порядке добавления.
        return playbill;
    }

}
