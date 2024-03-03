package ExamTask04_2023;

import java.lang.Math;

public class Circle extends Shape {
	private final double r;

	public Circle(double r){
		this.r = r;
	}

	public double gerR(){
		return r;
	}

	public double getArea(){
		return Math.PI * r * r;
	}

	public double getCircumference(){
		return Math.PI * 2 * r;
	}

	public String toString(){
		return "Circle [r=" + r + "]";
	}
}