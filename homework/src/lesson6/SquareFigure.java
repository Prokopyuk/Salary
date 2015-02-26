package lesson6;

public class SquareFigure extends Figure {

	private double side;

	public SquareFigure(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;

	}

	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side * 4;
	}

}
