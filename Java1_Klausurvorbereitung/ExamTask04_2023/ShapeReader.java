package ExamTask04_2023;

import java.util.ArrayList;

public class ShapeReader {
	private final ArrayList<Shape> shapes;

	public ShapeReader(String[] elements){
		shapes = new ArrayList<>();

		for(String element : elements){
			String[] list = element.split(";");

			if(list.length == 2){
				shapes.add(new Circle(Double.parseDouble(list[1])));
			}else{
				shapes.add(new Rectangle(Double.parseDouble(list[1]), Double.parseDouble(list[2])));
			}
		}
	}

	public ArrayList<Circle> getCircles(){
		ArrayList<Circle> circles = new ArrayList<>();
		for(Shape shape : shapes){
			if(shape instanceof Circle){
				circles.add((Circle) shape);
			}
		}
        return circles;
	}

	public ArrayList<Rectangle> getRectangles(){
		ArrayList<Rectangle> rectangles = new ArrayList<>();
		for(Shape shape : shapes){
			if(shape instanceof Rectangle){
				rectangles.add((Rectangle) shape);
			}
		}
        return rectangles;
	}

	public ArrayList<Shape> getShapes(double min){
		ArrayList<Shape> minShapes = new ArrayList<>();	
	
		for(Shape shape : shapes){
			if(shape.getArea() >= min){
				minShapes.add(shape);
			}
		}

        return minShapes;
	}
}