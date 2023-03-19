import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker inserter = new StepTracker(scanner);
        while (true) {
            printMenu();
            int usersInput = scanner.nextInt();

            if (usersInput == 1) {
                inserter.addNewNumberStepsPerDay(); //Вызывается метод для ввода количества шагов за определенный день
            } else if (usersInput == 2) {
                inserter.changeStepGoal();//Вызывается метод для изменения цели по количеству шагов за день
            } else if (usersInput == 3) {
                inserter.printStatistic();//Вызывается метод печати статистики за выбранный пользователем месяц
            } else if (usersInput == 4) {
                System.out.println("Пока"); // Завершение метода
                return;
            }else {
                System.out.println("Введена неверная команда, введите значение от 1 до 4");
            }
        }
    }
    public static void printMenu() {
        System.out.println("Что вы хотите сделать сейчас? Введите команду от 1 до 4");
        System.out.println(1 + ".Ввести количество шагов за определенный день");
        System.out.println(2 + ".Изменить цель по количеству шагов за день");
        System.out.println(3 + ".Напечатать статистику за определенный месяц");
        System.out.println(4 + ".Выход");
    }
}