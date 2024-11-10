package javaprograms.recursion;

public class NaturalNumberSum {

//	The method sumOfNaturalNumbers(int n) calculates the sum recursively.
//	If n is 1, it returns 1 as the base case.
//	Otherwise, it returns n + sumOfNaturalNumbers(n - 1), which keeps adding n to the sum of the previous numbers until it reaches 1.

	public static int sumOfNaturalNumbers(int n) {
		// Base case: if n is 1, return 1
		if (n == 1) {
			return 1;
		}
		// Recursive case: add n to the sum of (n-1) numbers
		return n + sumOfNaturalNumbers(n - 1);
	}

	public static void main(String[] args) {
		int n = 10; // Example: sum of first 10 natural numbers
		int sum = sumOfNaturalNumbers(n);
		System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
	}
}