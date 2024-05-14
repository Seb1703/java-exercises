import java.util.HashMap;
import java.util.Optional;

public class Exercise {

  public static void main(String[] args) {
    TelephoneBook myBook = new TelephoneBook(new HashMap<>());
    myBook.addEntry(new Person("Sebastian"), new TelephoneNumber("1234"));
    myBook.addEntry(new Person("Jan"), new TelephoneNumber("5678"));
    myBook.addEntry(new Person("Lisa"), new TelephoneNumber("9123"));

    Optional<TelephoneNumber> number = myBook.getTelephoneNumber("Liwsa");
    if(number.isPresent()){
      System.out.println(number.get().value());
    } else{
      System.out.println("Leider nicht gefunden");
    }
  }
}
