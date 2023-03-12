import java.util.Scanner;

 class StepTracker {
     Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    StepTracker(Scanner scan ) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i = i + 1) {
            monthToData[i] = new MonthData();
        }
    }

     void addNewNumberStepsPerDay() {
         System.out.println("Введите номер месяца, где 1 это Январь, а 12 это декабрь");
         int numberOfMonth = scanner.nextInt();
         if (numberOfMonth < 1) {
             if (numberOfMonth > 11)
                 System.out.println("Введен некорректный месяц, введите число от 1 до 12");
             return;
         }
         else {
             System.out.println("Введите номер дня от 1 до 30 включительно");
             int numberOfDay = scanner.nextInt();
             if (numberOfDay < 1) {
                 if (numberOfDay > 30) {
                     System.out.println("Введен некорректный день. Введите число от 1 до 30");
                 } return;
             }else {
                 System.out.println("Введите количество шагов");
                 int numberOfSteps = scanner.nextInt();
                 if (numberOfSteps < 0) {
                     System.out.println("Введено отрицательное количество шагов, введите положительное число");
                     return;
                 }

                 monthToData[numberOfMonth - 1].days[numberOfDay - 1] = numberOfSteps;// Я думаю что
                 // эта строчка должна сработать
             }
         }
     }
     int goalByStepsPerDay = 10000;
     void changeStepGoal() {
         System.out.println("Введите новую цель по шагам");
         int newGoal = scanner.nextInt();
         if (newGoal <= 0) {
             System.out.println("Введите значение цели больше нуля");
             return;
         }
         goalByStepsPerDay = newGoal;

     }
}