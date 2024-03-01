import java.util.ArrayList;

public class TravelAgency{
    private final String name;
    private final ArrayList<Partner> partners;

    public TravelAgency(String name){
        this.name = name;
        partners = new ArrayList<>();
    }

    public String name(){
        return name;
    }

    public ArrayList<Partner> partner(){
        return partners;
    }

    public void addPartner(Partner partner){
        partners.add(partner);
    }

    public boolean equals(Object object){
        return object instanceof TravelAgency;
    }

    public void print(){
        System.out.println(name);
        System.out.println("Unsere Partner: ");
        for(Partner p : partners){
            p.print();
        }
    }
}
