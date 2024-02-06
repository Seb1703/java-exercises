import java.util.Scanner;

public class Exercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double k = 1000;
		double b = 0.03;
		
		int cont = 0;

		while(cont == 0){
			double z = Exercise.jahreszins(k, b);
			System.out.println("Dein Jahreszfins beträgt: " + z);
			System.out.println("Zins fürs nächste Jahr berechnen? ja(0) nein(1)");
			cont = sc.nextInt();
			k += z;
		}
	}

	public static double jahreszins(double k, double b){
		return k * b;
	}
}