import java.util.ArrayList;

public class Exercise {

  public static void main(String[] args) {
    ArrayList<Dice> dices = new ArrayList<>();

    for(int i = 1; i < 6; i++){
      Dice newDice = new Dice(i);
      dices.add(newDice);
    }

    DiceCub myDiceCub = new DiceCub();

    for(int i = 1; i<6; i++){
      System.out.println("Wurf " + i);
      myDiceCub.RollTheDices(dices);
    }
  }
}
