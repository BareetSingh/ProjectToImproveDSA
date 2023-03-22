//Program of factorial using Recursion
import java.util.Scanner;

public class P3 {

    // recursive method to find the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // calculate the factorial of the number
        int factorial = factorial(n);

        // display the factorial
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}

