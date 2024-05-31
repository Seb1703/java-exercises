package Java2_Klausurvorbereitung.Optionals;

import java.util.Optional;

public class Exercise {
    public static void main(String[] args) {
        Car myCar = new Car("CLA45", "Mercedes", "AMG");
        System.out.println(myCar.toString());
        myCar.addition = Optional.empty();
        System.out.println(myCar.toString());
    }
}
