package lesson6;

public class Triangle extends Figure {

	private double cathetusA;
	private double cathetusB;

	public Triangle(double cathetusA, double cathetusB) {
		this.cathetusA = cathetusA;
		this.cathetusB = cathetusB;

		perimeter = calcPerimeter();
		square = (cathetusA + cathetusB) / 2;
	}

	// get &set Cathet A

	public double getCathetusA() {
		return cathetusA;
	}

	public void setCathetusA(double cathetusA) {
		this.cathetusA = cathetusA;
		square = (cathetusA + cathetusB) / 2;
		perimeter = calcPerimeter();
	}

	// get &set Cathet B
	public double getCathetusB() {
		return cathetusB;
	}

	public void setCathetusB(double cathetusB) {
		this.cathetusB = cathetusB;
		square = (cathetusA + cathetusB) / 2;
		perimeter = calcPerimeter();
	}

	// make perimeter, Square and Print info

	public double calcPerimeter() {
		double hypotenuse;
		hypotenuse = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
		return hypotenuse + cathetusA + cathetusB;
	}

	public void printFigureInfo() {
		System.out.println("Triangle cathetus A lenght is " + cathetusA
				+ " , cathetus B lenght is " + cathetusB + ", perimeter is "
				+ perimeter + ", square is  " + square);
	}
}
