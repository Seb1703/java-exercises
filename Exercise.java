public class Exercise {

  public static void main(String[] args) {
    Rental mueller = new Rental("Müller");

    mueller.add(new Car("Porsche", "911", Engine.ELECTRO, 2));
    mueller.add(new Truck("MAN", "TGX", Engine.DIESEL, 20));
    mueller.add(new Car("Opel", "Zafira Life", Engine.DIESEL, 7));
  }
}
