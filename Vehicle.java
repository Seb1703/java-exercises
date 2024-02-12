public class Vehicle {

  private String make;
  private String model;
  private double speed;

  private static int numberOfVehicles;

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
    Vehicle.numberOfVehicles += 1;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
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
    System.out.println(make + " " + model);
  }

  public static int getNumberOfVehicles(){
    return Vehicle.numberOfVehicles;
  }
}
