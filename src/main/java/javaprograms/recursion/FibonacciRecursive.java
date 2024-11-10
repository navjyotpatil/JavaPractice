package javaprograms.recursion;

import java.util.Scanner;


public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        scanner.close();
    }
    
    // Recursive method to calculate Fibonacci number at a specific position
    public static int fibonacci(int n) {
    	
    	//Base Case 
        if (n <= 1) {
            return n;
        }
        
        //Recursive Case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}