//Program for linear search, use user-defined functions to perform actions
import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int x = scanner.nextInt();
        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + result + ".");
        }
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
