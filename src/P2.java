//Program for finding the sum of first n natural numbers using Recursion

import java.util.Scanner;

public class P2 {

    // recursive method to find the sum of first n natural numbers
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter a value for n
        System.out.print("Enter a value for n: ");
        int n = input.nextInt();

        // calculate the sum of first n natural numbers
        int sum = sum(n);

        // display the sum
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
    }
}
