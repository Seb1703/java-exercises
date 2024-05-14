import java.util.HashMap;
import java.util.List;
import java.util.Map;

public record BookCollection(HashMap<Author, ArrayList<Book>> collection) {
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
        Author mostDiligentAuthor;
        for(Set a : collection.entrySet()){
            if()
        }
    }

    public Book getBookByTitle(String title){

    }
}
