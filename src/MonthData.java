import java.util.Scanner;

class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        System.out.println("Количество пройденных шагов по дням");
        for (int i = 0; i < days.length; i = i + 1) {
            System.out.println(days[i + 1] + "День: " + );// Мне нужно значение
            // из объекта массива monthToData, как к нему обратиться?
        }
    }
        int sumStepsFromMonth() {


            int sumOfStepsPerMonth = 0;
            for (int i = 0; i < days.length; i = i + 1) {
                sumOfStepsPerMonth = sumOfStepsPerMonth + days[i];
            }return sumOfStepsPerMonth;
        }

        //for (int i = 0; i < month)
        //System.out.println("лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого");

        //System.out.println();

    }
}