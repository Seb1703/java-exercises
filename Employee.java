public class Employee {

  private final int employeeId;
  private final Person person;
  private int salary;

  public Employee(int employeeId, Person person, int salary) {
    this.employeeId = employeeId;
    this.person = person;
    this.salary = salary;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getName() {
    return person.getName();
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) throws SalaryIncreaseTooHighException, SalaryDecreaseException{
    if(salary > this.salary * 1.1){
      throw new SalaryIncreaseTooHighException();
    }else if (salary < this.salary){
      throw new SalaryDecreaseException();
    }else{
      this.salary = salary;
    }
  }

  public void print() {
    System.out.println(employeeId + " - " + getName() + " - " + salary + "€");
  }
}
