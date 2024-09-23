public class Car {

    static String DEALER = "Tiriac Auto";

    String model;
    String color;//variabile de instanta


    void changeColorAndModel(String newModel, String newColor) {
        model = newModel;
        color = newColor;
    }

    void changeDealer(String newDealer) {
        DEALER = newDealer;
    }

}
