public class Seller extends Humann {

    public Seller(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "{ Seller: " + " " +
                " name: " + this.name + " " +
                " age: " + this.age + " " +
                "}";
    }
}
