public class Exercise {

  public static void main(String[] args) {
    int numberOfVehicles;
    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    Vehicle vehicle1 = new Vehicle("Porsche", "911", Engine.PETROL);
    Vehicle vehicle2 = new Vehicle("MAN", "TGX", Engine.ELECTRO);
    Vehicle vehicle3 = new Vehicle("Opel", "Zafira Life", Engine.GAS);

    numberOfVehicles = Vehicle.getNumberOfVehicles();
    System.out.println("Anzahl Fahrzeuge: " + numberOfVehicles);

    vehicle1.print();
    vehicle2.print();
    vehicle3.print();
  }
}
