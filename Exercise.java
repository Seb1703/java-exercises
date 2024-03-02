public class Exercise {

  public static void main(String[] args) {
    Company company = new Company("Maier GmbH");

    Person p1 = new Person("Max Schmid");
    Person p2 = new Person("Hans Mueller");
    Person p3 = new Person("Lisa Meier");

    Employee e1 = new Employee(1, p1, 50000);
    Employee e2 = new Employee(2, p2, 75000);
    Employee e3 = new Employee(3, p3, 40000);

    company.addEmployee(e1);
    company.addEmployee(e2);
    company.addEmployee(e3);
    company.addEmployee(new Employee(4, new Person("Peter Schneider"), 55000));
    company.addEmployee(new Employee(5, new Person("Miriam Albers"), 90000));

<<<<<<< HEAD
    try{
      e1.setSalary(49000);
    }catch(Exception e){
      if(e instanceof SalaryIncreaseTooHighException){
        System.out.println("Das Gehalt ist zu hoch");
      }else if(e instanceof SalaryDecreaseException){
        System.out.println("Das Gehalt ist geringer als das aktuelle");
      }
    }

    company.print();
=======
    System.out.println(company.toString());
>>>>>>> 5a598f54730dca7cc177d45e73c514e4fa9fdca0
  }
}
