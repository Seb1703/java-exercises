import java.util.HashMap;

public class Exercise {

  public static void main(String[] args) {
    TelephoneBook myBook = new TelephoneBook(new HashMap<>());
    myBook.addEntry(new Person("Sebastian"), new TelephoneNumber("1234"));
    myBook.addEntry(new Person("Jan"), new TelephoneNumber("5678"));
    myBook.addEntry(new Person("Lisa"), new TelephoneNumber("9123"));

    System.out.println(myBook.getTelephoneNumber("Lisa").value());
  }
}
