import java.util.Scanner;

public class Exercise{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Gib eine Ganzzahl ein: ");
		int number = sc.nextInt();
		
		if(number%2 == 0){
			System.out.println( number + " ist gerade!");
		}else{
			System.out.println( number + " ist ungerade!");
		}
	}
}
