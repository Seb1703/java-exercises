public class Exercise {

  public static void main(String[] args) {
    System.out.println("ID - Wuerfelwert");
    for(int i = 1; i < 6; i++){
      Dice dice = new Dice(i);
      dice.rollTheDice();
      System.out.println(dice.getId() + " - " + dice.getValue());
    }
  }
}
