package Java2_Klausurvorbereitung.WKQ123;

public enum ShapeType {
    CIRCLE(0),
    TRIANGLE(3),
    RECTANGLE(4);

    private final int corners;

    private ShapeType(int corners){
        this.corners = corners;
    }
}