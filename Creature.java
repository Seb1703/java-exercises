public class Creature {

  final private String name;
  final private int attackValue;
  private int hitpoints;

  public Creature(String name, int attackValue, int hitpoints) {
    this.name = name;
    this.attackValue = attackValue;
    this.hitpoints = hitpoints;
  }

  public String getName() {
    return name;
  }

  public int getAttackValue() {
    return attackValue;
  }

  public int getHitpoints() {
    return hitpoints;
  }

  public boolean attackCreature(Creature creature) {
    creature.hitpoints -= this.attackValue;
    System.out.println(
        this.name
            + " greift "
            + creature.name
            + " an und erzielt "
            + this.attackValue
            + " Schaden");
    System.out.println(creature.name + " hat noch " + creature.hitpoints + " Lebenspunkte");

    return creature.hitpoints <= 0;
  }
}
