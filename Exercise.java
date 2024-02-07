import java.util.Scanner;

public class Exercise{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int control;
		
		String[] aufgabenListe = new String[0];		

		do{
			System.out.println("Optionen: 1: Aufgabe hinzufügen; 2: Aufgabe löschen; 3: Aufgaben ausgeben; 4: Beenden");
			System.out.println("Was möchtest Du tun? ");
			control = sc.nextInt();
			sc.nextLine();
			
			switch(control){
				case 1:
					System.out.println("Gib bitte die Aufgabenbeschreibung ein: ");
					String aufgabe = sc.nextLine();
					aufgabenListe = Exercise.hinzuf(aufgabenListe, aufgabe);
					break;
				case 2:
					System.out.println("Gib bitte ein, welche Aufgabe gelöscht werden soll: ");
					int pos = sc.nextInt();
					aufgabenListe = Exercise.entfernen(aufgabenListe, pos);
					break;
				case 3:
					for(String element : aufgabenListe){
						System.out.println(element);
					}
          break;
				default:
					break;
			}
			
		}while(control != 4);
	}

	public static String[] hinzuf(String[] list, String aufg){
		String[] newList = new String[list.length + 1];
		for(int i = 0; i < list.length; i ++){
			newList[i] = list[i];
		}
		newList[list.length] = aufg;
		return newList;
	}

	public static String[] entfernen(String[] list, int pos){
		String[] newList = new String[list.length - 1];
		for(int i = 0; i < list.length - 1; i ++){
			if(i == pos){
				i--;
        pos--;
			}else{
				newList[i] = list[i];
			}
		}
		return newList;
  }
}
