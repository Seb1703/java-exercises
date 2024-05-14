import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


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

    public Author getMostDiligenAuthor(){
        Author mostDiligentAuthor = null;
        int mostBooks = 0;
        for(Entry<Author, List<Book>> entry : collection.entrySet()){
            if(entry.getValue().size() > mostBooks){
              mostDiligentAuthor = entry.getKey();
              mostBooks = entry.getValue().size();
            }
        }
        return mostDiligentAuthor;
    }

    public Book getBookByTitle(String title){

    }
}
