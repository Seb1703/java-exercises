public class Employee {

  private final int employeeId;
  private final Person person;
<<<<<<< HEAD
  private int salary;
=======
  private int salaryInEuro;
>>>>>>> 5a598f54730dca7cc177d45e73c514e4fa9fdca0

  public Employee(int employeeId, Person person, int salaryInEuro) {
    this.employeeId = employeeId;
    this.person = person;
    this.salaryInEuro = salaryInEuro;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getName() {
    return person.getName();
  }

  public int getSalaryInEuro() {
    return salaryInEuro;
  }

<<<<<<< HEAD
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
=======
  public void setSalaryInEuro(int salaryInEuro) {
    this.salaryInEuro = salaryInEuro;
  }

  public String toString() {
    return employeeId + " - " + getName() + " - " + salaryInEuro + "€";
>>>>>>> 5a598f54730dca7cc177d45e73c514e4fa9fdca0
  }
}
