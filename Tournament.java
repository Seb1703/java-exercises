import java.util.ArrayList;

public record Tournament(String title, ArrayList<Club> clubs, ArrayList<Pair<Club>> pairs) {
    public void addClub(Club club){
        this.clubs.add(club);
    }

    public ArrayList<Pair<Club>> pairs(){
        for(int i = 0; i < clubs.size(); i++){
            for(int j = 0; j < clubs.size(); j++){
                if(i != j){
                    pairs.add(new Pair<Club>(clubs.get(i), clubs.get(j)));
                }
            }
        }
        return pairs;
    }
}
