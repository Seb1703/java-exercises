import java.util.Scanner;

public class Exercise {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		System.out.println("Gebe eine Ganzzahl ein: ");
		double num1 = sc.nextDouble();
	
		System.out.println("Gebe eine weitere Ganzzahl ein: ");
		double num2 = sc.nextDouble();

		double result = num1/num2;
		System.out.println("Der Anteil deiner ersten Zahl an der zweiten beträgt: ");
		System.out.println(result*100 + "%");
  }
}
