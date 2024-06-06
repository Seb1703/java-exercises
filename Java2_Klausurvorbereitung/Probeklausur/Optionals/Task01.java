package Java2_Klausurvorbereitung.Probeklausur.Optionals;

import java.util.Optional;

public class Task01 {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "440i", "M");
        bmw.print();
        bmw.addition = Optional.empty();
        bmw.print();
    }
}
