package concreteclasses;

public class Customer extends Person{
    private int budget;

    @Override
    public void buy(int amount) {
        this.budget = this.budget - amount;
    }
    @Override
    public void sell

}
