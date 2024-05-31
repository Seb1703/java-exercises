package ExamTask02_2024;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Human>{
	public int compare(Human h1, Human h2){
		if(h1.salary < h2.salary){
			return 1;
		} else if(h1.salary > h2.salary){
			return -1;
		} else{
			return 0;
		}
	}
}
