package Java2_Klausurvorbereitung.Lambdafunktionen;

import javax.swing.event.SwingPropertyChangeSupport;

public class Task02 {
    public static void main(String[] args) {
        Data.getAnimals()
            .filter(Helper.isHigherThan(50))
            .map(Helper.toOutput)
            .forEach(System.out::println);
    }
}
