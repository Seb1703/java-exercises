public class Exercise {

  public static void main(String[] args) {
    // Erstelle eine ausführbare Klasse, welche den ganzzahligen Quotienten sowie den Divisionsrest einer Division auf der Konsole ausgibt.
    int dividend = 5;
    int divisor = 3;
    int quotient = Exercise.getQuotient(dividend, divisor);
    int rest = Exercise.getRest(dividend, divisor);

    System.out.println("Quotient: " + quotient);
    System.out.println("Rest: " + rest);
  }

  public static int getQuotient(int dividend, int divisor){
    return dividend/divisor;
  }

  public static int getRest(int dividend, int divisor){
    return dividend % divisor;
  }
}
