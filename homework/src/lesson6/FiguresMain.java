package lesson6;

import java.util.ArrayList;

import lesson7.Informable;

public class FiguresMain {

	public static void main(String[] args) {
	
		
		Figure c = new Circle(2.3);
		Figure t = new Triangle(4.5, 7.7);
		
		
		ArrayList<Figure> figures = new ArrayList<>();
		figures.add(c);
		figures.add(t);
		figures.add(new Circle(3.2));
		
	/*	for (Figure figure : figures) {
			figure.printFigureInfo();
		}*/
		
		
		
		Circle circle1 = new Circle(3.2);
		Circle circle2 = new Circle(1.2);
	
		circle1.printFigureInfo();
		circle2.printFigureInfo();
		
		SquareFigure sqr1  = new SquareFigure(2.0);
		
		
		Triangle triangle = new Triangle(2.0, 3.0);
		Triangle triangle2 = new Triangle(4.0,7.8);
		Figure [] figs = {circle1, circle2, sqr1, triangle};
		
		for (Figure figure : figs) {
			figure.printFigureInfo();
		}
	
		
	}
	public static void print(Informable inf){
		inf.printInfo();
	}

}
