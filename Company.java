import java.util.ArrayList;

public class Company {
    final private String name;
    final private ArrayList<Employee> employees;
    private int numberOfEmployees;

    public Company(String name){
        this.name = name;
        employees = new ArrayList<>();
        numberOfEmployees = 0;
    }

    public String name(){
        return name;
    }

    public ArrayList<Employee> employees(){
        return employees;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
        numberOfEmployees++;
    }

    public String toString(){
        return name + " (" + numberOfEmployees + " Mitarbeiter)";
    }
}
