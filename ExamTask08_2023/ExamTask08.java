package ExamTask08_2023;

import java.util.ArrayList;

public class ExamTask08 {
    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2010));
        cars.add(new Car(2020));

        CarVendor vendor = new CarVendor(cars);
        vendor.sortByConstructionYear();
        vendor.print();
    }
}
