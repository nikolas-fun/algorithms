package arrays;

public class Task4_RobberHouses {
  /*  3. Ограбление домов
    int[] houses = {2, 7, 9, 3, 1};
    Ты грабитель. Есть ряд домов, в каждом из которых хранится определённая сумма денег.
    Но есть проблема: нельзя ограбить два соседних дома, иначе сработает сигнализация.
    Найди максимальную сумму, которую можно получить.Ожидаемый результат:12.
    Объяснение: можно ограбить дома с суммами 2 + 9 + 1.*/
  public static int maxMoney(int[] houses) {
    int best = 0;
    int twoBack = 0;

        for (int money : houses) {
        int take = twoBack + money;
        int skip = best;

        twoBack = best;
        best = Math.max(take, skip);
    }
        return best;
    }
}

