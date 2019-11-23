package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №1.
 *
 * <p>
 * Тема: "Создание обобщённых методов".
 *
 * <p>
 * В рамках задания требуется описать и выполнить несколько методов, обобщённых
 * с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    @Override
    public void run() {
        int[] array = arrayFactory.getInstance(20);
        Integer[] obj = Numbers.castIntInteger(array);
        int min = Numbers.min(obj);
        int max = Numbers.max(obj);
        double avg = Numbers.avg(obj);

    }
}
