package arrays;

public class Task1_Traveler {
    /*1. Найди пропавшего путешественника

    Есть массив чисел от 1 до N

    int[] numbers = {1, 2, 5, 4, 6, 7, 8};

    но одно число потерялось.
    Найди пропущенное число.
            Условия:
    Не использовать сортировку.
    Ожидаемый результат: 3.*/

    public static int findMissing(int[] numbers) {
        int n = numbers.length + 1;
        int sum = n * (n + 1) / 2;

        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }
}
