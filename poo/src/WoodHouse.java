public class WoodHouse implements IHouse {

    @Override
    public void greetHomeOwner() {
       System.out.println("Hello home owner");
    }

    @Override
    public void buyHouse() {
        System.out.println("You bought the house");
    }
}
