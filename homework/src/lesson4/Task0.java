package lesson4;

public class Task0 {

	public static void main(String[] args) {
		System.out.print(summ(123));

	}
public static int summ (int n){

	if (n/10 == 0)
	{
		return 0;
	}
	
	return ((n%10)+summ(n/= 10));
	} 
}
