public class Exercise {

  public static void main(String[] args) {
    Barrel barrel = new Barrel(100);
    boolean go = true;
    do{
      try{
        barrel.addFluid(10);
        System.out.println(barrel.toString());
      }catch(BarrelOverflowException b){
        System.out.println("Dein Fass läuft über!");
        go = false;
      }

    }while(go);
  }
}
