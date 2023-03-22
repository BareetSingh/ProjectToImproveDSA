//Program for finding the sum of digits in a number using Recursion

import java.util.Scanner;

public class P5 {

    // recursive method to find the sum of digits in a number
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // calculate the sum of digits in the number
        int sum = sumOfDigits(n);

        // display the sum of digits
        System.out.println("The sum of digits in " + n + " is " + sum);
    }
}
