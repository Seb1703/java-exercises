public class Exercise {

  public static void main(String[] args) {
    System.out.println(Vehicle.getNumberOfVehicles());

    Vehicle vehicle1 = new Vehicle("Porsche", "911");
    System.out.println(vehicle1.toString());
    Vehicle vehicle2 = new Vehicle("MAN", "TGX");
    System.out.println(vehicle2.toString());
    Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life");
    System.out.println(vehicle3.toString());

    System.out.println(Vehicle.getNumberOfVehicles());
  }
}
