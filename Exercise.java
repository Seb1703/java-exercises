import java.util.Scanner;

public class Exercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		boolean repeat;
		double result;
		do{
			System.out.println("Gib bitte das Startkapital ein (in Euro): ");
			double k0 = sc.nextDouble();
			System.out.println("Gib bitte den Prozentsatz ein: ");
			double p = sc.nextDouble();
			p = p / 100;
			System.out.println("Gib bitte die Anzahl Jahre ein: ");
			int n = sc.nextInt();
		
			result = Exercise.calc(k0, p, n);

			System.out.println("Ergebnis: Das Endkapital beträgt: " + result + " Euro");
			System.out.println("Willst Du eine weitere Zinsrechnung durchführen (true, false)?: ");
			repeat = sc.nextBoolean();
		}while(repeat);
		
	}
	public static double calc(double k0, double p, int n){
		double result = k0;
		for(int i = 0; i < n; i++){
			result *= (1+p);
		}
		return result;
	}
}
