import java.util.ArrayList;

public class Exercise {

  public static void main(String[] args) {
    SkatCardDeck myDeck = new SkatCardDeck();
    Exercise.toString(myDeck.skatCards());
    myDeck.shuffleSkatCards();
    System.out.println("-----Suffled-----");
    Exercise.toString(myDeck.skatCards());
  }

  public static void toString(ArrayList<SkatCard> cards){
    for(SkatCard card: cards){
      System.out.println(card.getSkatDescription());
    }
  }
}
