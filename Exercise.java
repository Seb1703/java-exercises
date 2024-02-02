import java.util.Scanner;

public class Exercise {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Gebe eine Ganzzahl ein: ");
    int num1 = sc.nextInt();
	  System.out.println("Gebe eine Ganzzahl ein: ");
    int num2 = sc.nextInt();
	  int result = num1 + num2;
    System.out.println("Die Summe der Zahlen ist: ");
	  System.out.println(result);
  }
}
