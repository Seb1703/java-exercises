package ExamTask08_2023;

import java.util.ArrayList;
import java.util.Collections;

public class CarVendor{
	private ArrayList<Car> cars;

	public CarVendor(ArrayList<Car> cars){
		this.cars = cars;
	}

	public void sortByConstructionYear(){
		Collections.sort(cars, new ConstructionYearComparator());
	}

	public void print(){
		for(Car car : cars){
			System.out.println(car.getConstructionYear());
		}
	}
}