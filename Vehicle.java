public class Vehicle {
    private String make;
    private String model;
    private double speedInKmh;

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public double getSpeedInKmh(){
        return speedInKmh;
    }

    public void accelarate(int valueInKmh){
        speedInKmh += valueInKmh;
        System.out.println(this.toString() + " beschleunigt auf " + (int) speedInKmh + " km/h");
    }

    public void brake(int valueInKmh){
        speedInKmh -= valueInKmh;
        System.out.println(this.toString() + " bremst auf " + (int) speedInKmh + " km/h ab");
    }

    public String toString(){
        return make + model;
    }
}
