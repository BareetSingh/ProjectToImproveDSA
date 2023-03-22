//Program for Stack(use user-defined functions to perform actions)

import java.util.Scanner;

public class P8 {

    private static final int MAX_SIZE = 100;  // Maximum size of the stack
    private static int top = -1;  // Initialize top of the stack to -1
    private static int[] stack = new int[MAX_SIZE];  // Create the stack array

    public static void push(int x) {
        /*
         * This function adds an element to the top of the stack.
         */
        if (top == MAX_SIZE - 1) {
            System.out.println("Error: Stack overflow");
            return;
        }
        stack[++top] = x;
        System.out.println(x + " pushed to stack");
    }

    public static int pop() {
        /*
         * This function removes and returns the element at the top of the stack.
         */
        if (top == -1) {
            System.out.println("Error: Stack underflow");
            return -1;
        }
        int x = stack[top--];
        return x;
    }

    public static int peek() {
        /*
         * This function returns the element at the top of the stack without removing it.
         */
        if (top == -1) {
            System.out.println("Error: Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public static boolean isEmpty() {
        /*
         * This function returns true if the stack is empty, false otherwise.
         */
        return (top == -1);
    }

    public static void main(String[] args) {
        // Example usage
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int x = sc.nextInt();
                    push(x);
                    break;
                case 2:
                    int popped = pop();
                    if (popped != -1) {
                        System.out.println(popped + " popped from stack");
                    }
                    break;
                case 3:
                    int topValue = peek();
                    if (topValue != -1) {
                        System.out.println("Top element is " + topValue);
                    }
                    break;
                case 4:
                    boolean empty = isEmpty();
                    if (empty) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again");
            }
            System.out.println();
        }
    }
}
