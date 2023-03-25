//Program for Bubble sort, use user-defined functions to perform actions

import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Sort the array using bubble sort
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // User-defined function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
