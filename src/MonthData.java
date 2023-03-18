public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i = i + 1) {
            System.out.println((i + 1) + ".день: " + days[i]);
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
        //int dayBetterThanGoal = 0;
        int currentSeries = 0;
        int finalSeries = 0;
        for (int m = 0; m < days.length; m = m + 1) {
            if (days[m] >= goalByStepsPerDay) { // Если количество шагов в m-ный день больше цели
                System.out.println("Вы достигли цели по шагам или превзошли ее в " + days[m + 1] + " день.");
                currentSeries = currentSeries + 1;
                if(currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                    currentSeries = 0;                             //finalSeries = currentSeries;
                }                                                  // Текущая серия + 1
            } else  {                                              // Если меньше цели
                currentSeries = 0;                       // Финальная серия = текущей серии
                                                                   // Текущую серию обнуляем.             //if (finalSeries < currentSeries) {
            }

                                                                //} else {
                                                                //currentSeries = 0;
                                                                //}
        }
        return finalSeries;
    }
}