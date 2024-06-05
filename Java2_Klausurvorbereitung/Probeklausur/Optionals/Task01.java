package Java2_Klausurvorbereitung.Probeklausur.Optionals;

import java.util.Optional;

public class Task01 {
    public static void main(String[] args) {
        Car beamer = new Car("BMW","440i",  "M");
        beamer.print();
        beamer.addition = Optional.empty();
        beamer.print();
    }
}
