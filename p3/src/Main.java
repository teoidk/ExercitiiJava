import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
       Human michael = new Human();
       michael.age = 40;
       michael.name = "Michael Jackson";

       System.out.println("The age is " + michael.age);
        System.out.println("The name is " + michael.name);

        michael.talk();

        int x = 10;
        Integer y = Integer.valueOf(11);

        Integer integerFromString = Integer.valueOf(20);

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println("Car1 dealer - " + car1.DEALER);
        System.out.println("Car2 dealer - " + car2.DEALER);


        car1.changeDealer("Autovit");
        System.out.println("Car1 dealer - " + car1.DEALER);
        System.out.println("Car2 dealer - " + car2.DEALER); //se schimba automat si car1 si car2




        Room room1 = new Room();
        room1.roomType = "Livingroom";
        room1.color = "Red";
        room1.squareMeters = 20;

    }
}