package lesson6;

public class SquareFigure extends Figure {

	private double side;

	public SquareFigure(double side) {
		this.side = side;
		perimeter = side * 4;
		square = side * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
		perimeter = side * 4;
		square = side * side;
	}

	public void printFigureInfo() {
		System.out.println("Square  side is  " + side + ", perimeter is "
				+ perimeter + ", square is  " + square);
	}

}
