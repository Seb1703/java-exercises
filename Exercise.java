public class Exercise {

  public static void main(String[] args) {
    Company sap = new Company("SAP");
    sap.addEmployee(new Employee(1, new Person("Sebastian"), 100000));
    sap.addEmployee(new Employee(2, new Person("Lisa"), 5000));
    sap.addEmployee(new Employee(3, new Person("Jan"), 13));

    System.out.println(sap.toString());
    for(Employee employee : sap.employees()){
      System.out.println(employee.toString());
    }
  }
}
