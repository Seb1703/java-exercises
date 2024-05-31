package Java2_Klausurvorbereitung.Lambdafunktionen;

import java.util.function.Function;
import java.util.function.Predicate;

public class Helper {
    public static Predicate<Animal> isNewBorn = animal -> animal.age() < 1;
    public static Function<Animal, String> toOutput = 
        animal -> animal.firstName() + " " + animal.lastName() + " ist " + animal.size() + " Zentimeter groß.";

    public static Predicate<Animal> isHigherThan(int size){
        return animal -> animal.size() > size;
    }
}
