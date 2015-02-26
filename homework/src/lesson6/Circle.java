package lesson6;

public class Circle extends Figure {

	private double radius;
	private final double pi = 3.14;

	public Circle() {
		// not necessary to write "super" as it is called for default
		super();
	}

	public Circle(double radius) {

		this.radius = radius > 0 ? radius : 0;

	}

	public void setRadius(double radius) {
		this.radius = radius;

	}

	public double getRadius() {
		return Math.round(radius * 100) / 100;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return pi * radius * radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * pi * radius;
	}

}
