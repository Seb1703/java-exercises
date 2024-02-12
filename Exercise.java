public class Exercise {

  public static void main(String[] args) {
    Vehicle PorscheTaycan = new Vehicle();
    PorscheTaycan.setMake("Porsche");
    PorscheTaycan.setModel("Taycan");

    PorscheTaycan.accelarate(30);
    PorscheTaycan.accelarate(30);
    PorscheTaycan.brake(20);
    PorscheTaycan.accelarate(40);;
  }
}
