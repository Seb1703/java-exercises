import java.util.ArrayList;

public class Exercise {

  public static void main(String[] args) {
    Tournament myTournament = new Tournament("myTournament", new ArrayList<>(), new ArrayList<>());
    myTournament.addClub(new Club("SC Freiburg", 0));
    myTournament.addClub(new Club("Bayern München", 0));
    myTournament.addClub(new Club("Borussia Dortmund", 0));
      
    for(Pair<Club> p : myTournament.pairs()){
      System.out.println(p.partA().name() + " - " + p.partB().name());
    }
  }
}
