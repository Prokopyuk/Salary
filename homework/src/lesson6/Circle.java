package lesson6;

public class Circle extends Figure {

	
	private double radius;
	private final double pi = 3.14;

	public Circle(double radius){
		this.radius = radius;
		perimeter = 2 * pi * radius;
		square = pi * radius * radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		square = pi * radius * radius;
		perimeter = 2 * pi * radius;
	}

	public double getRadius() {
//		return radius;
		return Math.round(radius * 100) / 100;
	}

	public void printFigureInfo() {
		System.out.println("Circle radius is  " + radius
				+ ", perimeter is " + perimeter + ", square is  " + square);
	}
	
}
