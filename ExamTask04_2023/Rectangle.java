package ExamTask04_2023;

public class Rectangle extends Shape {
	private final double a;
	private final double b;

	public Rectangle(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double getArea(){
		return a * b;
	}

	public double getCircumference(){
		return 2 * a + 2 * b;
	}

    public String toString(){
		return "Rectangle [a=" + a + " , b=" + b +"]";
	}
}