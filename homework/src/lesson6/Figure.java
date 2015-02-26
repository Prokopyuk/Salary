package lesson6;

import lesson7.Drawable;
import lesson7.Informable;

//abstract public class Figure implements Drawable, Informable{
abstract public class Figure {
	public double  perimeter;
	public double  area;
 
	public Figure() {

	}

	public abstract double getArea() ;
	
	public abstract double getPerimeter() ;

	public  void printFigureInfo()
	{
		System.out.println(getClass().getSimpleName() + " perimeter = "+getPerimeter()+", square = " + getArea());
	}
}
