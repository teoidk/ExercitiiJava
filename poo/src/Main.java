import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<IHouse> houses = new ArrayList();
        WoodHouse woodHouse = new WoodHouse();
        IHouse woodHouse2 = new WoodHouse();

        SteelHouse steelHouse = new SteelHouse();
        IHouse steelHouse2 = new SteelHouse();

        woodHouse.buyHouse();
        woodHouse2.buyHouse();

        steelHouse.buyHouse();
        steelHouse2.buyHouse();

        IHouse.add(woodHouse);
        IHouse.add(steelHouse);
    }

}