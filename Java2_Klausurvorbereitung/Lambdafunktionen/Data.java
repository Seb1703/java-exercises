package Java2_Klausurvorbereitung.Lambdafunktionen;

import java.util.stream.Stream;

public class Data {
    public static Stream<Animal> getAnimals(){
        return Stream.of(new Animal("Bello", "Bella", 60, 20));
    }
}
