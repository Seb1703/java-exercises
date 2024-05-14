import java.util.HashMap;

public class Exercise {

  public static void main(String[] args) {
    BookCollection myCollection = new BookCollection(new HashMap<>());
    Author danBrown = new Author("Dan brown");
    myCollection.addBook(danBrown, new Book("Illuminati"));
    myCollection.addBook(danBrown, new Book("Illuminati"));
    myCollection.addBook(new Author("Goethe"), new Book("Faust"));

    System.out.println(myCollection.getMostDiligenAuthor().name());
  }
}
