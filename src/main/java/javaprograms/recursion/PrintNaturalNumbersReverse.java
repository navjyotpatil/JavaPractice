package javaprograms.recursion;

public class PrintNaturalNumbersReverse {
	
//	The printNumbers(int n) function prints numbers from 𝑛 down to 1.
//	Base Case: If n is 0, the recursion stops.
//	The function first prints n and then calls itself with n - 1, resulting in a countdown from 𝑛 to 1
//	
	
    public static void printNumbers(int n) {
        // Base case: if n is 0, stop recursion
        if (n == 0) {
            return;
        }
        // Print the current number before the recursive call
        System.out.print(n + " ");
        // Recursive call for n - 1 to continue printing in descending order
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;  // Example: print numbers from 10 to 1
        System.out.print("Natural numbers from " + n + " to 1: ");
        printNumbers(n);
    }
}