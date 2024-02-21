public class Truck extends Vehicle{
    private final int cargo;
    private boolean isTransformed;

    public Truck(String make, String model, Engine engine, int cargo){
        super(make, model, engine);
        this.cargo = cargo;
    }

    public int Cargo(){
        return cargo;
    }

    public boolean isTransformed(){
        return isTransformed;
    }

    public void transform(){
        if(isTransformed){
            isTransformed = false;
        }else{
            isTransformed = true;
        }
    }

    public String toString(){
        return super.getMake() + " " + super.getModel() + " (" + super.getEngine().getDescription() + ", " + cargo + "t)";
    }
}
