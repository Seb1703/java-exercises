import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;


public record BookCollection(HashMap<Author, List<Book>> collection) {
    public void addAuthor(Author author) throws DuplicateKeyException{
        try{
            if(collection.containsKey(author)){
                throw new DuplicateKeyException();
            } else{
                collection.put(author, new ArrayList<>());
            }
        } catch (DuplicateKeyException dke){
            System.out.println(dke.getMessage());
        }
    }

    public void addBook(Author author, Book book){
        if(!collection.containsKey(author)){
            collection.put(author, new ArrayList<>());
        }
        collection.get(author).add(book);
    }

    public Optional<Author> getMostDiligenAuthor(){
        Author mostDiligentAuthor = null;
        int mostBooks = 0;
        for(Entry<Author, List<Book>> entry : collection.entrySet()){
            if(entry.getValue().size() > mostBooks){
              mostDiligentAuthor = entry.getKey();
              mostBooks = entry.getValue().size();
            }
        }
        return Optional.ofNullable(mostDiligentAuthor);
    }

    public Optional<Book> getBookByTitle(String title){
      for(List<Book> books : collection.values()){
        for(Book b : books){
          if (b.title() == title){
            return Optional.of(b);
          }
        }
      }
      return Optional.empty();
    }
}
