import java.util.ArrayList;

public class Exercise {

  public static void main(String[] args) {
    ArrayList<Player> players = new ArrayList<>();
    players.add(new Player("Hans"));
    players.add(new Player("Lisa"));

    DiceGame game = new DiceGame(players);
    game.start();
  }
}
