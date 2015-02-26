package lesson6;

public class Triangle extends Figure {

	private double cathetusA;
	private double cathetusB;

	public Triangle(double cathetusA, double cathetusB) {
		this.cathetusA = cathetusA;
		this.cathetusB = cathetusB;
	
		
	}

	// get &set Cathet A

	public double getCathetusA() {
		return cathetusA;
	}

	public void setCathetusA(double cathetusA) {
		this.cathetusA = cathetusA;
		
	}

	// get &set Cathet B
	public double getCathetusB() {
		return cathetusB;
	}

	public void setCathetusB(double cathetusB) {
		this.cathetusB = cathetusB;
		
	}

	// make perimeter, Square and Print info

	public double calcPerimeter() {
		double hypotenuse;
		hypotenuse = Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
		return hypotenuse + cathetusA + cathetusB;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((cathetusA + cathetusB) / 2);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return calcPerimeter();
	}


}
