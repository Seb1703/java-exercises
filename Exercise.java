public class Exercise {

  public static void main(String[] args) {
    // Erstelle eine ausführbare Klasse, welche die drei Variablen name (Datentyp String), age (Datentyp int) und gender (Datentyp char) deklariert, initialisiert und über die Konsole ausgibt.
    String name = "Sebastian";
    int age = 19;
    char gender = 'm';

    getPersonalInformation(name, age, gender);
  }

  public static void getPersonalInformation(String name, int age, char gender){
    System.out.println("Name: " + name);
    System.out.println("Alter: " + age);
    System.out.println("Geschlecht: " + gender);
  }
}
