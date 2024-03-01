public class Exercise {

  public static void main(String[] args) {
    Rental rental = new Rental("Fahrzeugvermietung Mueller");
    TravelAgency travelAgency = new TravelAgency("Reisebüro Schmidt");
    travelAgency.addPartner(rental);

    travelAgency.print();

    Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
    Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
    Car car2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

    rental.addVehicle(car1);
    rental.addVehicle(truck1);
    rental.addVehicle(car2);

    rental.print();
  }
}
