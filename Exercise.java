import java.util.Random;
import java.util.Scanner;

public class Exercise{
	public static void main(String[] args){
		Random random = new Random();
		int randInt = random.nextInt(100)+1;
		
		Scanner sc = new Scanner(System.in);
		int correct = 0;

		int eingabe;
		while(correct == 0){
			System.out.println("Gib eine Zahl ein: ");
			eingabe = sc.nextInt();
			if(eingabe == randInt){
				correct = 1;
				System.out.println("Du hast richtig geraten!");
			}else{
				System.out.println("Leider falsch!");
				System.out.println("Weiter Spielen? Gib 0 ein, sonst 1!");
				correct = sc.nextInt();
			}
		}
	}
}
