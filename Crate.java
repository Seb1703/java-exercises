public class Crate{
    private Bottle box1;
    private Bottle box2;
    private Bottle box3;
    private Bottle box4;
    private Bottle box5;
    private Bottle box6;

    public Crate(){

    }

    public void insertBottle(Bottle bottle, int box){
        if(box == 1){
            box1 = bottle;
        } else if(box == 2){
            box2 = bottle;
        } else if(box == 3){
            box3 = bottle;
        } else if(box == 4){
            box4 = bottle;
        } else if(box == 5){
            box5 = bottle;
        } else if(box == 6){
            box6 = bottle;
        }
    }

    public Bottle takeBottle(int box){
        if(box == 1){
            return box1;
        } else if(box == 2){
            return box2;
        } else if(box == 3){
            return box3;
        } else if(box == 4){
            return box4;
        } else if(box == 5){
            return box5;
        } else if(box == 6){
            return box6;
        }
        return box6;
    }
}
