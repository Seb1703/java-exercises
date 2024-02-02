import java.util.Scanner;

public class Exercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Gib den ersten Operanden ein: ");
		double operand1 = sc.nextDouble();
		System.out.print("Gib den Operator ein: ");
    sc.nextLine();
		String operator = sc.nextLine();
		System.out.print("Gib den zweiten Operanden ein: ");
		double operand2 = sc.nextDouble();
		
		double result;
		switch(operator){
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "*":
				result = operand1 * operand2;
				break;
			case "/":
				result = operand1 / operand2;
				break;
      default:
        result = 0;
		}
	  System.out.println("Das Ergebnis ist: " + result);
	}
}
