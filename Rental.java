import java.util.ArrayList;

public class Rental implements Partner{

  private String name;
  private ArrayList<Vehicle> vehicles;

  public Rental(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }

  public void addVehicle(Vehicle vehicle) {
    vehicles.add(vehicle);
  }

  public void addAllVehicles(Vehicle... vehicles) {
    for (Vehicle v : vehicles) {
      this.vehicles.add(v);
    }
  }

  public void transformAllTrucks() {
    for (Vehicle c : vehicles) {
      if (c instanceof Truck) {
        Truck t = (Truck) c;
        t.transform();
      }
    }
  }

  public void print() {
    //System.out.println(name);
    System.out.println("Unsere Fahrzeuge: ");
    for (Vehicle v : vehicles) {
      v.print();
    }
  }
}
