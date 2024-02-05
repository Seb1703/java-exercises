import java.util.Scanner;

public class Exercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Gib deinen Vorname ein: ");
		String vorname = sc.nextLine();
		System.out.print("Gib deinen Nachname ein: ");
		String nachname = sc.nextLine();
		System.out.print("Gib dein Geschlecht ein (m,w,d): ");
		String geschlecht = sc.nextLine();
		System.out.print("Gib dein Alter ein: ");
		int alter = sc.nextInt();
		
		if(alter >= 18){
			switch(geschlecht){
				case "m":
					System.out.println("Hallo Herr " + nachname);
					break;
				case "w":
					System.out.println("Hallo Frau " + nachname);
					break;
				default:
					System.out.println("Hallo " + vorname);
					break;
			}
		}else{
			System.out.println("Hallo " + vorname);
		}
	}
}