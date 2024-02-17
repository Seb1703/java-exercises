public class Exercise {

  public static void main(String[] args) {
    Creature zombie = new Creature("Zombie", 2, 10);
    Creature vampire = new Creature("Vampir", 4, 6);

    CreatureGame game = new CreatureGame(zombie, vampire);
    game.simulateFight();
  }
}
