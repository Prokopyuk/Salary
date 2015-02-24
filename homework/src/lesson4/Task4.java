package lesson4;

import java.util.ArrayList;


public class Task4 {
	public static void main(String[] args){
		
		
		Car bmw = new Car();
		//bmw.color = "red";
		//ArrayList<Car> cars = new ArrayList<>();
		//cars.add(example);
	}
}

	 class Car{
		
		public String model;
		int releaseYear;
		String color;
		double fuelVolume = 0;
		int fuelPerKm;
		int currentDistasnce;
		boolean IsStarted = false;
		
		public void fill(double fuel){
			fuelVolume+=fuel;
		}
		
		public void start(){
			if (fuelVolume>0.0){
				 IsStarted = true; 
				 System.out.println("The car started");
			}else{
				 IsStarted = false; 
				 System.out.println(" car didn`t start");
			}
		}
		public void move(int distance){
			
		}
		
		public void printInfo(String model, int releaseYear , String color, double fuelVolume, int fuelPerKm, int currentDistasnce, boolean IsStarted){
			System.out.println();
		}
		
		
	}

