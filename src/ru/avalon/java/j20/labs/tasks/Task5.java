package ru.avalon.java.j20.labs.tasks;

import java.util.Arrays;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.List;
import java.util.Set;

import java.util.*;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №5.
 *
 * <p>
 * Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final int[] array = arrayFactory.getInstance(20);
        Integer[] ar = Numbers.castIntInteger(array);

        List<Integer> list = Arrays.asList(ar);

        Set<Integer> set = 
        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами подходящих
         * классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность выполнения
         * задания.
         */
    }
}
