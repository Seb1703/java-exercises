import java.util.ArrayList;
import java.util.Random;

public class SchoolClass {
    private String name;
    private ArrayList<Pupil> pupils = new ArrayList<>();
    
    public void addPupil(Pupil pupil){
        this.pupils.add(pupil);
    }

    public ArrayList<Pair<Pupil>> getPairs(){
        ArrayList<Pair<Pupil>> pairs = new ArrayList<>();

        Random rand = new Random();
        ArrayList<Pupil> copiedList = new ArrayList<>(pupils);
        int i;

        while(copiedList.size() > 1){
            i = rand.nextInt(copiedList.size()-1);
            Pupil pupil1 = copiedList.get(i);
            copiedList.remove(i);
            i = copiedList.size()-1;
            Pupil pupil2 = copiedList.get(i);
            copiedList.remove(i);
            pairs.add(new Pair<Pupil>(pupil1, pupil2));
        }

        if(copiedList.size() == 1){
            pairs.add(new Pair<Pupil>(copiedList.get(0), null));
        }
        return pairs;
    }
}
