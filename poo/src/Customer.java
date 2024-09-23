public class Customer extends Humann {

    private int budget;

    public Customer(String name, int age, int budget) {
        super(name,age);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "{ Customer: " + " " +
                " name: " + this.name + " " +
                " age: " + this.age + " " +
                " budget: " + this.budget + " " +
                " } ";

    }
}
