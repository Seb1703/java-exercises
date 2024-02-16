import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {
    final DiceCup diceCup;
    final ArrayList<Dice> dices = new ArrayList<>();
    final ArrayList<Player> players;
    final Scanner scanner;

    public DiceGame(ArrayList<Player> players){
        this.players = players;

        for(int i = 0; i < 3; i++){
            dices.add(new Dice(i));
        }

        diceCup = new DiceCup();
        scanner = new Scanner(System.in);
    }

    public void start(){
        int activePlayers = players.size();
        for(Player player : players){
            if(player.isActive()){
                System.out.println("Möchtest du Würfel (true/false)? ");
                player.setActive(scanner.nextBoolean());
                if(player.isActive()){
                    
                }
            }
        }
    }

    public void move(Player player){

    }
}
