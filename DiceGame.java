import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {

  private DiceCup diceCup;
  private ArrayList<Dice> dices;
  private ArrayList<Player> players;
  private Scanner scanner;
  private int numberOfActivePlayers;

  public DiceGame(ArrayList<Player> players) {
    diceCup = new DiceCup();
    dices = new ArrayList<>();
    this.players = players;
    scanner = new Scanner(System.in);
    for (Player player : players) {
      player.setActive(true);
      player.setSpecialAvailable(true);
    }
    numberOfActivePlayers = players.size();
  }

  public void start() {
    while (numberOfActivePlayers >= 1) {
      for (Player player : players) {
        if (player.isActive()) {
          move(player);
        }
      }
    }
    Player bestPlayer = players.get(0);
    for (Player player : players) {
      if (player.getScore() > bestPlayer.getScore()) {
        bestPlayer = player;
      }
    }
    System.out.println(
        "Der Sieger heisst "
            + bestPlayer.getName()
            + " und hat "
            + bestPlayer.getScore()
            + " Punkte");
  }

  private void move(Player player) {
    dices.add(new Dice(1));
    dices.add(new Dice(2));
    dices.add(new Dice(3));
    System.out.println(player.getName() + " hat aktuell " + player.getScore() + " Punkte");
    System.out.print(player.getName() + ", moechtest Du wuerfeln (true, false)?: ");
    int score = 0;
    if (scanner.nextBoolean()) {
      if(player.getSpecialAvailable()){
        System.out.println(player.getName() + ", möchtest Du einmalig Spezialwürfel verwenden (true, false)?");
        if(scanner.nextBoolean()){
          System.out.println(player.getName() + ", welche Spezialwürfel möchtest Du verwenden (1=4-5-6-Würfel, 2=1-2-3-Würfel)?");
          switch (scanner.nextInt()){
            case 1:
              DiceCup hvdc = new DiceCup();
              ArrayList<Dice> hvd = new ArrayList<>();
              for(int i = 0; i<3; i++){
                hvd.add(new HighValueDice(i));
              }
              hvdc.rollTheDices(hvd);
              for (Dice dice : hvd) {
                score += dice.getValue();
              }
              break;
            case 2:
              DiceCup lvdc = new DiceCup();
              ArrayList<Dice> lvd = new ArrayList<>();
              for(int i = 0; i<3; i++){
                lvd.add(new LowValueDice(i));
              }
              lvdc.rollTheDices(lvd);
              for (Dice dice : lvd) {
                score += dice.getValue();
              }
              break;
          }
        }
        player.setSpecialAvailable(false);
      }else{
          diceCup.rollTheDices(dices);
          for (Dice dice : dices) {
            score += dice.getValue();
          }
        }

      
      
      System.out.println(player.getName() + " hat " + score + " Punkte");
      player.setScore(player.getScore() + score);
      System.out.println(player.getName() + " hat insgesamt " + player.getScore() + " Punkte");
      if (player.getScore() > 50) {
        System.out.println(player.getName() + " hat verloren");
        player.setScore(0);
        player.setActive(false);
        numberOfActivePlayers--;
      }
    } else {
      player.setActive(false);
      numberOfActivePlayers--;
    }
    System.out.println();
    dices.clear();
  }
}
