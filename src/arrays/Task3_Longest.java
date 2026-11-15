package arrays;

import java.util.HashSet;
import java.util.Set;

public class Task3_Longest {
    /*
2. Самая длинная цепочка
    Дан неотсортированный массив целых чисел.

    int[] numbers = {100, 4, 200, 1, 3, 2, 5, 6};

    Найди длину самой длинной последовательности последовательных чисел.
            Например: 1, 2, 3, 4, 5, 6.
    Ожидаемый результат: 6.
    Условия:
    Не использовать сортировку.*/

    public static int longest(int[] arr) {
        Set<Integer> set = new HashSet<>();
    for(int number : arr){
        set.add(number);
    }
        int currentLength = 0;
        for(int number : arr){
        if(!set.contains(number -1)){
            int currentNumber = number;
             currentLength = 1;
            while(set.contains(currentNumber+1)){
                currentLength++;
                currentNumber++;
            }
        }
    }
        return currentLength;
    }



}
