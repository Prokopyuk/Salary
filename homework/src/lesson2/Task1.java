package lesson2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Task1 {

	public static void main(String[]args)throws IOException {
		FileReader fr = new FileReader("C:/Java/text.txt");
		Scanner scan = new Scanner(fr);
		String result = "";
		String upperCase  = "";
		
		
		while (scan.hasNextLine()){
			result = scan.nextLine();
			for (int i = 0; i < result.length(); i++){
				
			if (Character.isUpperCase(result.charAt(i))){
				upperCase +=  result.charAt(i);
				}
			}
		
		 }
			
		FileWriter fw = new FileWriter("Output");
		fw.write(upperCase);
		fw.flush();
		
	}
}


