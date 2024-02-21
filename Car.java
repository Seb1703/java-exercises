public class Car extends Vehicle{
    private final int seats;

    public Car(String make, String model, Engine engine, int seats){
        super(make, model, engine);
        this.seats = seats;
    }

    public int seats(){
        return seats;
    }

    public void doATurboBoost(){
        speed *=2;
    }

    public String toString(){
        return super.getMake() + " " + super.getModel() + " (" + super.getEngine().getDescription() + ", " + seats + " Sitzplätze)";
    }
}
