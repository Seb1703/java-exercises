package ExamTask02_2024;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
	private final ArrayList<Human> employees;
		
	public Company(){
		employees = new ArrayList<>();
	}

	public void addEmployee(Human employee){
		employees.add(employee);
	}

	public void sortDefault(){
		Collections.sort(employees);
	}

	public void sortBySalary(){
		Collections.sort(employees, new SalaryComparator());
	}

	public void printAllEmployees(){
		for(Human employee : employees){
			System.out.println(employee.toString());
		}
	}
}