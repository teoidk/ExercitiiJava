package concreteclasses;

public class Shop implements IShop{
    private int shopBudget;
    public Shop() {
        this.shopBudget = 0;

    }
    @Override
    public void itemSold(int amount){
        this.shopBudget = this.shopBudget + amount;
    }
    public void displayShopBudget ()
}
