public class Exercise {

  public static void main(String[] args) {
    Dice dice1 = new Dice(1);
    Dice dice2 = new Dice(2);

    Player player1 = new Player("Lisa");
    Player player2 = new Player("Hans");

    player1.setScore(dice1.getValue());
    player2.setScore(dice2.getValue());

    System.out.println(player1.name() + " würfelt eine " + player1.getScore());
    System.out.println(player2.name() + " würfelt eine " + player2.getScore());

    if(player1.getScore() < player2.getScore()){
      System.out.println(player2.name() + " hat gewonnen!");
    }else if(player1.getScore() > player2.getScore()){
      System.out.println(player1.name() + " hat gewonnen!");
    }else{
      System.out.println("Unentschieden!");
    } 
  }
}
