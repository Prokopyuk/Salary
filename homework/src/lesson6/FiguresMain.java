package lesson6;

public class FiguresMain {

	public static void main(String[] args) {
	
		
		Circle circle1 = new Circle(3.2);
		Circle circle2 = new Circle(1.2);
	
		SquareFigure sqr1  = new SquareFigure(2.0);
		
		
		Triangle triangle = new Triangle(2.0, 3.0);
		
		Figure [] figs = {circle1, circle2, sqr1, triangle};
		
		for (Figure figure : figs) {
			figure.printFigureInfo();
		}
		
	}

}
