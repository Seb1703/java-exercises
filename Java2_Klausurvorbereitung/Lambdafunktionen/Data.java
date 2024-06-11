package Java2_Klausurvorbereitung.Lambdafunktionen;

import java.util.stream.Stream;

public class Data {
    public static Stream<Animal> getAnimals(){
        return Stream.of(new Animal("Max", "Mustermann", 100, 10));
    }
}
