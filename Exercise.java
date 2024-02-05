import java.util.Scanner;
//import java.util.Math;
import java.util.Random;

public class Exercise{
	public static void main(String[] args){
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int randInt = random.nextInt(100)+1;
		System.out.println("Eine Zahl wurde ermittelt! Gebt je eine Zahl ein!");
		System.out.print("Spieler 1: ");
		int spieler1 = sc.nextInt();
		System.out.print("Spieler 2: ");
		int spieler2 = sc.nextInt();

		int dif1 = Math.abs(spieler1 - randInt);
		int dif2 = Math.abs(spieler2 - randInt);
		System.out.println(randInt);
		if(dif1 < dif2){
			System.out.println("Spieler 1 hat gewonnen!");
		}else if(dif2 < dif1){
			System.out.println("Spieler 2 hat gewonnen!");
		}else{
			System.out.println("Unentschieden!");
		}
	}
}