public enum SkatCardValue {
    SEVEN("Seve", 7),
    EIGHT("Aight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 2),
    Checkers("Checkers", 3),
    KING("King", 4),
    ACE("ACE", 11);

    final private String description;
    final private int value;

    SkatCardValue(String description, int value){
        this.description = description;
        this.value =value;
    }

    public String getDescription(){
        return description;
    }

    public int getValue(){
        return value;
    }
}
