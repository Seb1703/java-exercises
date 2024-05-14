import java.util.Map;
import java.util.Optional;

public record TelephoneBook(Map<Person, TelephoneNumber> entries) {
    public void addEntry(Person person, TelephoneNumber telephoneNumber){
        this.entries.put(person, telephoneNumber);
    }

    public Optional<TelephoneNumber> getTelephoneNumber(String name){
        Person person = null;
        for (Person p : entries.keySet()){
            if (p.name() == name){
                person = p;
                break;
            }
        }
        return Optional.ofNullable(entries.get(person));
    }
}
