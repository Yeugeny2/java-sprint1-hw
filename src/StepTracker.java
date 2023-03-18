import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;


    StepTracker(Scanner scan) {
        MonthData monthData = new MonthData();
        for (int i = 0; i < monthToData.length; i = i + 1) {
            monthToData[i] = new MonthData();
        }
    }


    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца, за который Вы хотите ввести количество шагов, от 1 до 12");
        int numberOfMonth = scanner.nextInt();

        if (numberOfMonth >= 1) {
            if (numberOfMonth <= 12) {
                System.out.println("Номер месяца сохранен в переменную numberOfMonth");//Здесь должно совершаться действие с присваиванием номера месяца

            }
        }else {
            System.out.println("Введен неверный номер месяца, введите номер от 1 до 12");
            return;
        }

        System.out.println("Введите номер дня, за который вы хотите ввести количество шагов");
        int numberOfDay = scanner.nextInt();
        if (numberOfDay > 0) {
            if (numberOfDay < 31) {
                System.out.println("Номер дня сохранен в переменную numberOfDay");// Здесь должно совершаться действие с присваиванием номера дня
            } else {
                System.out.println("Введен неверный номер дня, введите номер дня от 1 до 30");
                return;
            }
        }

            System.out.println("Введите количество шагов, которое Вы хотите ввести");
            int numberOfSteps = scanner.nextInt();
            if (numberOfSteps > 0) {
                System.out.println("Количество шагов сохранено в переменную numberOfSteps");

            } else {
                System.out.println("Введено неверное количество шагов. Введите количество больше 0");
                return;
            }MonthData monthData = monthToData[numberOfMonth - 1];
            monthData.days[numberOfDay - 1] = numberOfSteps;

    }


    void changeStepGoal() {
        System.out.println("Введите новую цель по количеству шагов");
        int newGoalOfSteps = scanner.nextInt();
        if (newGoalOfSteps <= 0) {
            System.out.println("Введена некорректная цель по количеству шагов. Введите значение больше 0");
        } else {
            goalByStepsPerDay = newGoalOfSteps;
        }
    }


    void printStatistic() {
        MonthData monthData;
        Converter konv = new Converter();
        System.out.println("Введите номер месяца, за который вы хотите получить статистику");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1) {
            if (monthNumber > 12) {
                System.out.println("Вы ввели неверный номер месяца. Введите число от 1 до 12");
                return;
            }
        } monthData = monthToData[monthNumber - 1]; // Получение соответствующего месяца
        int sumSteps = monthData.sumStepsFromMonth(); // Получение суммы шагов за месяц
        monthData.printDaysAndStepsFromMonth(); // Получаем статистику шагов за месяц по дням
        System.out.println("Общее количество шагов за месяц = " + monthData.sumStepsFromMonth());
        System.out.println("Максимально пройденное количество шагов за месяц " + monthData.maxSteps());
        System.out.println("Среднее пройденное количество шагов за месяц " + (sumSteps / 30));
        System.out.println("Пройденная за месяц дистанция в км " + konv.convertToKm(sumSteps));
        System.out.println("Количество сожженных килокалорий за месяц " + konv.convertStepsToKilocalories(sumSteps));
        System.out.println("Вывод лучшей серии " + monthData.bestSeries(goalByStepsPerDay));
    }
}