public class Vehicle {

  private final String make;
  private final String model;
  private final Engine engine;
  protected double speed;
  private static int numberOfVehicles;

  public Vehicle(String make, String model, Engine engine) {
    this.make = make;
    this.model = model;
    this.engine = engine;
    numberOfVehicles++;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public Engine getEngine() {
    return engine;
  }

  public double getSpeedInKmh(){
    return speed;
  }

  public static int getNumberOfVehicles() {
    return numberOfVehicles;
  }

  public void accelerate(int value) {
    speed += value;
    System.out.println(make + " " + model + " beschleunigt auf " + speed + "km/h");
  }

  public void brake(int value) {
    speed -= value;
    System.out.println(make + " " + model + " bremst auf " + speed + "km/h ab");
  }

  public void print() {
    System.out.println(make + " " + model + " (" + engine.getDescription() + ")");
  }
}
