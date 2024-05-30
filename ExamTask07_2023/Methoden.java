package ExamTask07_2023;
public class Methoden {
    //Vorlesung v. 19.01.2024

    public static void main(String[] args){
        int result = Methoden.add(1, 2);
        System.out.println(result);

        String fullName = Methoden.getFullName("Dr.", "Sebastian", "Geimer");
        System.out.println(fullName);

        Methoden.sendLetter();

        String time = Methoden.getCurrentTime();
        System.out.println(time);
    }

    public static int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static String getFullName(String title, String firstName, String lastName){
        return title + " " + firstName + " " + lastName;
    }

    public static void sendLetter(){
        System.out.println("Letter send");
    }

    public static String getCurrentTime(){
        return "Es ist 13.21 Uhr";
    }
}
