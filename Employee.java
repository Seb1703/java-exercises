public class Employee {
    final private int employeeId;
    final private Person person;
    private int salaryInEuro;

    public Employee(int employeeId, Person person, int salaryInEuro){
        this.employeeId = employeeId;
        this.person = person;
        this.salaryInEuro = salaryInEuro;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return person.getName();
    }

    public void setSalaryInEuro(int salaryInEuro){
        this.salaryInEuro = salaryInEuro;
    }

    public int getSalaryInEuro(){
        return salaryInEuro;
    }

    public String toString(){
        return employeeId + " - " + person.getName() + " - " + salaryInEuro + "€";
    }
}