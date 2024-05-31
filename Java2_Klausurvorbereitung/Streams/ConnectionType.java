package Java2_Klausurvorbereitung.Streams;

public enum ConnectionType {
    TYPC,
    THUNDERBOLT,
    MICRO;

    public boolean isModern() {
        return this == ConnectionType.MICRO ? false : true;
    }
}
