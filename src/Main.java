import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker inserter = new StepTracker(scanner);
        while (true) {
            printMenu();
            int usersInput = scanner.nextInt();

            if (usersInput == 1) {
                System.out.println("Выполняется команда 1");
                inserter.addNewNumberStepsPerDay(); //Вызывается класс, метод или команда для пунка 1
            } else if (usersInput == 2) {
                System.out.println("Выполняется команда 2");
                inserter.changeStepGoal();//Вызывается класс, метод или команда для пункта 2
            } else if (usersInput == 3) {
                System.out.println("Выполняется команда 3");
                //Вызывается класс, метод или команда для пункта 3
            } else if (usersInput == 4) {
                System.out.println("Пока");
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