package concreteclasses;

public class Seller extends Person{
    private Shop foodShop;

    public Person(Shop foodShop) {
        this.foodShop = foodShop;
    }

    @Override
    public void buy(int amount) {
        System.out.println("Seller cant buy");
    }
    @Override
    public void sell() {
        this.foodShop
    }
}
