package ExamTask04_2023;

import java.util.ArrayList;

public class ExamTask04 {
    public static void main(String[] args){
        String[] elements = {"Circle;2",
            "Rectangle;1;4",
            "Circle;1",
            "Circle;6",
            "Rectangle;2;2"};

        ShapeReader reader = new ShapeReader(elements);

        ArrayList<Circle> circles = reader.getCircles();
        for(Circle circle : circles){
            System.out.println(circle.toString());
        }

        ArrayList<Rectangle> rectangles = reader.getRectangles();
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle.toString());
        }
    }
}
