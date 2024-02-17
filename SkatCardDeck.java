import java.util.ArrayList;
import java.util.Random;

public class SkatCardDeck {
    final private ArrayList<SkatCard> skatCards;

    public SkatCardDeck(){
        skatCards = new ArrayList<>();

        SkatCardColor[] colors = SkatCardColor.values();
        SkatCardValue[] values = SkatCardValue.values();

        for(SkatCardColor color : colors){
            for(SkatCardValue value : values){
                skatCards.add(new SkatCard(color, value));
            }
        }
    }

    public ArrayList<SkatCard> skatCards(){
        return skatCards;
    }

    public void shuffleSkatCards(){
        ArrayList<SkatCard> newDeck = new ArrayList<>();
        Random rand = new Random();

        int size = skatCards.size();
        for(int i = 0; i < size; i++){
            int index = rand.nextInt(size - i);
            newDeck.add(skatCards.get(index));
            skatCards.remove(index);
        }

        skatCards.addAll(newDeck);
    }
}
