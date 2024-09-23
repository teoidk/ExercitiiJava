public class Vehicle {
    private String model;
    private String manufacturer;
    private int price;

    public Vehicle(String model, String manufacturer, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ Vehicle: " + " " +
                " model: " + model + " " +
                " manufacturer: " + manufacturer + " " +
                " price: " + price + " " +
                " } ";

    }
}
