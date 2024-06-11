package Java2_Klausurvorbereitung.Lambdafunktionen;

import java.util.function.Function;
import java.util.function.Predicate;

public class Helper {
    public static Predicate<Animal> isNewBorn = a -> a.age() < 1;
    public static Function<Animal, String> toOutput = a -> a.firstName() + " " +a.lastName() + " ist " + a.size() + " Zentimeter groß.";

    public static Predicate<Animal> isHigherThan(int size){
        return a -> a.size() > size;
    }
}
