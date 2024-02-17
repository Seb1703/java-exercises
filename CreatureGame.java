public class CreatureGame {
    final private Creature creature1;
    final private Creature creature2;
    private int numberOfRounds;

    public CreatureGame(Creature creature1, Creature creature2){
        this.creature1 = creature1;
        this.creature2 = creature2;
        numberOfRounds = 0;
    }

    public void simulateFight(){
        boolean check;
        do{
            numberOfRounds +=1;
            System.out.println(this.toString());
            check = creature1.attackCreature(creature2);
            if(!check){
                check = creature2.attackCreature(creature1);    
            }

        }while(!check);
        if(creature1.getHitpoints() <= 0){
            System.out.println(creature2.getName() + " hat " + creature1.getName() + " vernichtet!");
        }else{
            System.out.println(creature1.getName() + " hat " + creature2.getName() + " vernichtet!");
        }
    }

    public boolean move(Creature creature1, Creature creature2){
        return creature1.attackCreature(creature2);
    }

    public String toString(){
        return "Runde " + numberOfRounds + " " 
        + creature1.getName() + " (" + creature1.getAttackValue() + " - " + creature1.getHitpoints() + "), " 
        + creature2.getName() + " (" + creature2.getAttackValue() + " - " + creature2.getHitpoints() + ")";
    }
}
