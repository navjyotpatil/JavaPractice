package javaprograms.recursion;

public class PrintNaturalNumbers {
	
//	The printNumbers(int n) function prints numbers from 1 to 𝑛
//	Base Case: If n is 0, it stops recursion.
//	The function calls itself with n - 1, so it completes the lower numbers first. After returning, it prints n, resulting in numbers from 1 to 𝑛
//	
    public static void printNumbers(int n) {
        // Base case: if n is 0, stop recursion
        if (n == 0) {
            return;
        }
        // Recursive call for n - 1 first to print numbers in ascending order
        printNumbers(n - 1);
        // Print the current number after the recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;  // Example: print numbers from 1 to 10
        System.out.print("Natural numbers from 1 to " + n + ": ");
        printNumbers(n);
    }
}	