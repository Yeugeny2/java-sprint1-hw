public class Converter {

    int convertToKm(int steps) {
      double lenghtOfStep = 0.00075;                                                           //int lenghtOfStep = 1;
      double distanse =(lenghtOfStep * steps)/1000;                                            //int distance = (lenghtOfStep * steps)/1000;
                                                                                               //return distance;
        return steps;
    }


    int convertStepsToKilocalories(int steps) {
        int oneStep = 50; // за один шаг сжигается 50 калорий
        int lostCalories = (oneStep * steps)/1000; // умножаем количество сжигаемых калорий за один шаг на
                                                    // количество пройденных шагов и переводим в килоКалории
        return lostCalories;
    }

}