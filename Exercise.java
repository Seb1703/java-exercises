public class Exercise {

  public static void main(String[] args) {
    int numberOfVehicles;
    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    Car vehicle1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
    Truck vehicle2 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
    Car vehicle3 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    System.out.println(vehicle1.toString());
    System.out.println(vehicle2.toString());
    System.out.println(vehicle3.toString());

    vehicle1.accelerate(50);
    vehicle2.transform();
    vehicle1.doATurboBoost();
    vehicle2.transform();
  }
}
