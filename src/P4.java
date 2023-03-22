//Program for printing Fibonacci Series using Recursion

import java.util.Scanner;

public class P4 {

    // recursive method to print Fibonacci series up to n terms
    public static void printFibonacciSeries(int n, int a, int b) {
        if (n > 0) {
            int c = a + b;
            System.out.print(c + " ");
            printFibonacciSeries(n - 1, b, c);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter a value for n
        System.out.print("Enter a value for n: ");
        int n = input.nextInt();

        // print the Fibonacci series up to n terms
        System.out.print("Fibonacci series up to " + n + " terms: ");
        System.out.print("0 1 ");
        printFibonacciSeries(n - 2, 0, 1);
    }
}
