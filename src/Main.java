import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    StepTracker stepCount = new StepTracker();
    StepTracker changeGoal = new StepTracker();
    while (true) {
     printMenu();
        int i = scanner.nextInt();
        if (i == 1) {
            System.out.println("Выполняется команда 1");
           stepCount.addNewNumberStepsPerDay(); //Вызываем класс по вводу количества шагов за день
        } else if (i == 2) {
            System.out.println("Выполняется команда 2");
            changeGoal.changeStepGoal();
            //Вызываем класс по изменению цели количества шагов за день
        } else if (i == 3) {
            System.out.println("Выполняется команда 3");
            //Вызываем класс Напечатать статистику за определенный месяц
        } else if (i == 4) {
            System.out.println("Пока");
            return;
        } else {
            System.out.println("Извините, такой команды пока нет");
        }
    }
}


public static void printMenu() {
    System.out.println("Введите команду от 1 до 4");
    System.out.println("1 - Ввод количества шагов за день");
    System.out.println("2 - Изменить цель по количеству шагов за день");
    System.out.println("3 - Напечатать статистику за опеределенный месяц");
    System.out.println("4 - Выйти из приложения");
}
}