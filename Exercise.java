import java.util.Optional;

import javax.swing.text.html.Option;

public class Exercise {

  public static void main(String[] args) {
    Crate<Bottle> crate = new Crate<>();

    try {
      crate.insertBottle(new BeerBottle(), 1);
      crate.insertBottle(new BeerBottle(), 2);
      crate.insertBottle(null, 3);
      crate.insertBottle(new WineBottle(), 4);
      crate.insertBottle(new WineBottle(), 5);
      crate.insertBottle(new WineBottle(), 6);

      Optional<Bottle> myBottle = crate.takeBottle(3);
      if(myBottle.isPresent()){
        if (myBottle.get() instanceof BeerBottle beerBottle) {
          beerBottle.chugALug();
        }
      } else{
        System.out.println("Flasche ist leer");
      }
    } catch (CrateIndexOutOfBoundsException e) {
      System.err.println(e.getMessage());
    }
  }
}
