package Java2_Klausurvorbereitung.Optionals;

import java.util.Optional;

public class Car {
    public String name;
    public String brand;
    public Optional<String> addition;

    public Car(String name, String brand){
        this.name = name;
        this.brand = brand;
        this.addition = Optional.empty();
    }

    public Car(String name, String brand, String addition){
        this.name = name;
        this.brand = brand;
        this.addition = Optional.ofNullable(addition);
    }

    public String toString(){
        String output = this.brand + " " + this.name;
        return this.addition.isPresent() ? output + " " + this.addition.get() : output;
    }
}
