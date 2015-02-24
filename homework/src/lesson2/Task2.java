package lesson2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[]args)throws IOException{
	
		FileReader fr = new FileReader("C:/Java/text.txt");
		Scanner scan = new Scanner(fr);
		String dataString = "";
		
		while(scan.hasNextLine()){
		StringBuilder builder = new StringBuilder(dataString);	
		
		dataString = scan.nextLine();
		builder.reverse();
		String result = builder.toString();
		
		System.out.println(result);
		
		}
				
	}
}
