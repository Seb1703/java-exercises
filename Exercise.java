public class Exercise {

  public static void main(String[] args) {
    Crate myCrate = new Crate();

    myCrate.insertBottle(new WineBottle(), 1);
    myCrate.insertBottle(new BeerBottle(), 2);

  }
}
