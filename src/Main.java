import arrays.Task2_Unique;
import basics.Task1_Sum;
import strings.Task3_CharFrequency;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       /* 1. Напиши метод, который принимает число n и возвращает сумму чисел от 1 до n.

        2. Найти второй по величине уникальный элемент массива без сортировки.
                Пример: [10, 5, 8, 10, 3] → 8.

        3.Посчитать, сколько раз каждый символ встречается в строке.
        Пример: "hello" → h:1, e:1, l:2, o:1.*/
        //Решение___1
        System.out.println(Task1_Sum.sum(3));
        System.out.println("<------->");

        //Решение___2
        int[] array = {5, 10, 8, 10, 3};
        System.out.println(Task2_Unique.getUnique(array));
        System.out.println("<------->");

        //Решение___3
String testString = "Hello";
        Map<Character, Integer> map = Task3_CharFrequency.countChars(testString);

        System.out.println(map);


    }
}