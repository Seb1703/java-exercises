package Java2_Klausurvorbereitung.Lambdafunktionen;

public class Task2 {
    public static void main(String[] args) {
        Data.getAnimals()
            .filter(animal -> animal.size() > 50)
            .map(Helper.toOutput)
            .forEach(System.out::println);
    }
}
