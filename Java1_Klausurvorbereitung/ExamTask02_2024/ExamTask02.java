package ExamTask02_2024;

public class ExamTask02{
	public static void main(String[] args){
		Company airbus = new Company();
		airbus.addEmployee(new Human("Steffen", "Merk", 24, 1000));
		airbus.addEmployee(new Human("Marianna", "", 28, 2000));
		
		airbus.sortBySalary();
		airbus.printAllEmployees();
		airbus.sortDefault();
		airbus.printAllEmployees();
	}
}
