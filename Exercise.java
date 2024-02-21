public class Exercise {

  public static void main(String[] args) {
    Rental mueller = new Rental("Müller");

    mueller.addVehicle(new Car("Porsche", "911", Engine.ELECTRO, 2));
    mueller.addVehicle(new Truck("MAN", "TGX", Engine.DIESEL, 20));
    mueller.addVehicle(new Car("Opel", "Zafira Life", Engine.DIESEL, 7));

    mueller.print();
  }
}
