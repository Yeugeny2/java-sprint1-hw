public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i = i + 1) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sum = 0;
        for (int j = 0; j < days.length; j = j + 1) {
            sum = sum + days[j];
        }return sum;
    }

    int maxSteps() {
        int maxNumberOfSteps = 0;
        for (int k = 0; k < days.length; k = k + 1) {
            if (maxNumberOfSteps < days[k]) {
                maxNumberOfSteps = days[k];
            }
        }return maxNumberOfSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;

        for (int m = 0; m < days.length; m = m + 1) {
            if (days[m] >= goalByStepsPerDay) { // Если количество шагов в m-ный день больше цели
                currentSeries = currentSeries + 1; // Тогда добавляем к текущей серии дней единицу
                if(currentSeries > finalSeries) {  //Если текущая серия дней превышающих цель > финальной серии
                    finalSeries = currentSeries;   // Тогда присваиваем финальной серии значение текущей серии
                }
            } else  {                              // Иначе если количество шагов в m-ный день меньше цели
                currentSeries = 0;                 // Тогда обнуляем текущую серию
            }
        }
        return finalSeries;
    }
}