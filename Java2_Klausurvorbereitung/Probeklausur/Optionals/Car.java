package Java2_Klausurvorbereitung.Probeklausur.Optionals;

import java.util.Optional;


public class Car {
    public String make;
    public String model;
    public Optional<String> addition;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, String addition){
        this.make = make;
        this.model = model;
        this.addition = Optional.ofNullable(addition);
    }

    public void print(){
        if(addition.isPresent()){
            System.out.println(make + " " + model + " " + addition.get());
        }else{
            System.out.println(make + " " + model);
        }
    }
}
