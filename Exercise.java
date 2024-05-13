import java.util.ArrayList;

public class Exercise {

  public static void main(String[] args) {
    SchoolClass myClass = new SchoolClass();
    myClass.addPupil(new Pupil("Franziska", "w"));
    myClass.addPupil(new Pupil("Fritz", "m"));
    myClass.addPupil(new Pupil("Hans", "m"));
    myClass.addPupil(new Pupil("Jennifer", "w"));
    myClass.addPupil(new Pupil("Lisa", "m"));
    myClass.addPupil(new Pupil("Max", "m"));
    myClass.addPupil(new Pupil("Peter", "m"));

    ArrayList<Pair<Pupil>> pairs = myClass.getPairs();

    for(Pair<Pupil> p : pairs){
      Pupil pupil1 = p.partA();
      Pupil pupil2 = p.partB();
      if(pupil2 == null){
        System.out.println(pupil1.name + " - null");
      } else{
        System.out.println(pupil1.name + " - " + pupil2.name);
      }
    }
  }
}
