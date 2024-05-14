import java.util.Optional;

public class Crate <T extends Bottle>{

  private Optional<T> box1;
  private Optional<T> box2;
  private Optional<T> box3;
  private Optional<T> box4;
  private Optional<T> box5;
  private Optional<T> box6;

  public void insertBottle(T bottle, int box) throws CrateIndexOutOfBoundsException {
    if (box < 1 || box > 6) {
      throw new CrateIndexOutOfBoundsException();
    }

    switch (box) {
      case 1 -> box1 = Optional.ofNullable(bottle);
      case 2 -> box2 = Optional.ofNullable(bottle);
      case 3 -> box3 = Optional.ofNullable(bottle);
      case 4 -> box4 = Optional.ofNullable(bottle);
      case 5 -> box5 = Optional.ofNullable(bottle);
      case 6 -> box6 = Optional.ofNullable(bottle);
    }
  }

  public Optional<T> takeBottle(int box) throws CrateIndexOutOfBoundsException {
    if (box < 1 || box > 6) {
      throw new CrateIndexOutOfBoundsException();
    }

    return switch (box) {
      case 1 -> box1;
      case 2 -> box2;
      case 3 -> box3;
      case 4 -> box4;
      case 5 -> box5;
      default -> box6;
    };
  }
}
