package JavaPractice.JavaPractice;

import org.testng.annotations.Test;

public class Recursion {
	
	public static void main(String[] args) {
		
		int number = 5;
		System.out.println("Factorial of number :"+number +" is: "+ factorial(number));
		
		
	}
	
	@Test
	public static int factorial(int n) {
		
		//Base Case
		if(n <=1) {
			return 1;
		}
		
		//recursive case
		return n * factorial(n-1);
		
	}

}


