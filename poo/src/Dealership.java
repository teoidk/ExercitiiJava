import java.util.ArrayList;

public class Dealership {
    private Customer customer;
    private Seller seller;
    private ArrayList<Vehicle> vehicles;

    public Dealership(Customer customer, Seller seller, ArrayList<Vehicle> vehicles){
        this.customer = customer;
        this.seller = seller;
        this.vehicles = vehicles;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void displayVehicle() {
        for(Vehicle vehicle : this.vehicles){
            System.out.println(vehicle);
        }
    }

    public void sell(Customer customer, Vehicle vehicle) {
        int currentCustomerBudget = customer.getBudget();
        int vehiclePrice = vehicle.getPrice();

        if(customer.getBudget() >= vehiclePrice) {
            vehicles.remove(vehicle);
            int bugdetAfter = currentCustomerBudget - vehicle.getPrice();
            customer.setBudget(bugdetAfter);

        } else {
            System.out.println("Nu va incadrati in buget");
        }
    }


}
