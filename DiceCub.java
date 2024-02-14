import java.util.ArrayList;

public class DiceCub{
    
    public void RollTheDices(ArrayList<Dice> dices){
        System.out.println("ID - Würfelwert");
        for(Dice element : dices){
            element.rollTheDice();
            System.out.println(element.getId() + " - " + element.getValue());
        }
    }

}