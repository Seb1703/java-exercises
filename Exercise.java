import java.util.HashMap;
import java.util.Optional;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Exercise {

  public static void main(String[] args) {
    BookCollection myCollection = new BookCollection(new HashMap<>());
    Author danBrown = new Author("Dan brown");
    //myCollection.addBook(danBrown, new Book("Illuminati"));
    //myCollection.addBook(danBrown, new Book("Illuminati"));
    //myCollection.addBook(new Author("Goethe"), new Book("Faust"));

    Optional<Author> mostDeligentAuthor = myCollection.getMostDiligenAuthor();
    if(mostDeligentAuthor.isEmpty()){
      System.out.println("There is no deligent author :(");
    }else {
      System.out.println(mostDeligentAuthor.get().name());
    }
  }
}
