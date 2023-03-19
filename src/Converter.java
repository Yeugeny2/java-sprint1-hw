public class Converter {


    Converter() {

    }
    int convertToKm(int steps) {
      int lenghtOfStep = 75;
      int distance =(lenghtOfStep * steps)/100000;

        return distance;
    }


    int convertStepsToKilocalories(int steps) {
        int oneStep = 50; // за один шаг сжигается 50 калорий
        int lostCalories = (oneStep * steps)/1000; // умножаем количество сжигаемых калорий за один шаг на
                                                    // количество пройденных шагов и переводим в килоКалории
        return lostCalories;
    }

}