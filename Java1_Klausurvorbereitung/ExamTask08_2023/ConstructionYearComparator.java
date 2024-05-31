package ExamTask08_2023;

import java.util.Comparator;

public class ConstructionYearComparator implements Comparator<Car>{
	public int compare(Car c1, Car c2){
		if(c1.getConstructionYear() < c2.getConstructionYear()){
			return 1;
		} else if(c1.getConstructionYear() > c2.getConstructionYear()){
			return -1;
		} else{
			return 0;
		}
	}
}
