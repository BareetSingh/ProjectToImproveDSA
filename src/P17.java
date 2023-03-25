//Program for Binary Search, use user-defined functions to perform actions
import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int x = scanner.nextInt();
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + result + ".");
        }
    }

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
