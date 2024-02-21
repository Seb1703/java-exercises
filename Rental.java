import java.util.ArrayList;

public class Rental {
    private final String name;
    private final ArrayList<Vehicle> vehicles;

    public Rental(String name){
        this.name = name;
        vehicles = new ArrayList<>();
    }

    public String name(){
        return name;
    }

    public ArrayList<Vehicle> vehicles(){
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void addVehicles(Vehicle... vehicles){
      for (Vehicle v : vehicles) {
        this.vehicles.add(v);
      }
    }

    public void print(){
        System.out.println("Fahrzeugvermietung " + name);
        System.out.println("Unsere Fahrzeuge: ");
        for(Vehicle vehicle : vehicles){
            vehicle.print();
        }
    }
}
