package arrays;

import java.util.TreeSet;

public class Task2_Unique {
    /*Найти второй по величине уникальный элемент массива без сортировки.
            Пример: [10, 5, 8, 10, 3] → 8.*/
public static int getUnique(int[] array) {

    TreeSet<Integer> numbers = new TreeSet<>();
    for (int number : array) {
        numbers.add(number);
    }
     numbers.pollLast();
    return numbers.last();
}
}
