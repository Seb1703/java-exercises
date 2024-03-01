import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exercise {

  public static void main(String[] args) {
    ArrayList<Coordinate> coordinates = new ArrayList<>();
    coordinates.add(new Coordinate(1,2));
    coordinates.add(new Coordinate(2,3));
    coordinates.add(new Coordinate(0,2));

    Collections.sort(coordinates);

    for(Coordinate c : coordinates){
      c.print();
    }
  }
}
