import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];


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
}