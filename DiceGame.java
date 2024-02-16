import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {
    final DiceCup diceCup;
    final ArrayList<Dice> dices = new ArrayList<>();
    final ArrayList<Player> players;
    final Scanner scanner;
    private int activePlayers;

    public DiceGame(ArrayList<Player> players){
        this.players = players;
        activePlayers = players.size();

        for(int i = 0; i < 3; i++){
            dices.add(new Dice(i));
        }

        for(Player player : players){
            player.setActive(true);
        }

        diceCup = new DiceCup();
        scanner = new Scanner(System.in);
    }

    public void start(){
        while(activePlayers > 0){
            for(Player player : players){
                if(player.isActive()){
                    System.out.println(player.getName() + " hat aktuell " + player.getScore() + " Punkte.");
                    System.out.println("Möchtest du Würfel (true/false)? ");
                    player.setActive(scanner.nextBoolean());
                    if(player.isActive()){
                        this.move(player);
                        System.out.println(player.getName() + " hat insgesamt " + player.getScore() + " Punkte.");
                        if(player.getScore() > 50){
                            System.out.println(player.getName() + " hat verloren!");
                            activePlayers = 0;
                            player.setScore(0);
                            break;
                        }
                    }else{
                        activePlayers -= 1;
                    }
                }
            }
        }

        Player winner = players.get(0);
        for(Player player : players){
            if(winner.getScore() < player.getScore()){
                winner = player;
            }
        }

        System.out.println(winner.getName() + " hat mit " + winner.getScore() + " Punkten gewonnen!");
    }

    public void move(Player player){
        diceCup.rollTheDices(dices);
        int value = 0;
        for(Dice dice : dices){
            value += dice.getValue();
        }
        player.setScore(player.getScore()+value);
        System.out.println(player.getName() + " hat " + value + " Punkte.");
    }
}
