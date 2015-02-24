package lesson6;

abstract public class Figure {

	public double  perimeter;
	public double  square;

	public Figure() {

	}

	public double getSquare() {
		return square;
	}

	public double getPerimeter() {
		 return perimeter;
	}

	abstract public void printFigureInfo();
}
