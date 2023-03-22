//Program for Queue(use user-defined functions to perform actions)

import java.util.Scanner;

public class P9 {

    private static final int MAX_SIZE = 100;  // Maximum size of the queue
    private static int[] queue = new int[MAX_SIZE];  // Create the queue array
    private static int front = -1, rear = -1;  // Initialize front and rear of the queue to -1

    public static void enqueue(int x) {
        /*
         * This function adds an element to the rear of the queue.
         */
        if (rear == MAX_SIZE - 1) {
            System.out.println("Error: Queue overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = x;
        System.out.println(x + " enqueued to queue");
    }

    public static int dequeue() {
        /*
         * This function removes and returns the element at the front of the queue.
         */
        if (front == -1 || front > rear) {
            System.out.println("Error: Queue underflow");
            return -1;
        }
        int x = queue[front++];
        return x;
    }

    public static int peek() {
        /*
         * This function returns the element at the front of the queue without removing it.
         */
        if (front == -1 || front > rear) {
            System.out.println("Error: Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public static boolean isEmpty() {
        /*
         * This function returns true if the queue is empty, false otherwise.
         */
        return (front == -1 || front > rear);
    }

    public static void main(String[] args) {
        // Example usage
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if queue is empty");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to enqueue: ");
                    int x = sc.nextInt();
                    enqueue(x);
                    break;
                case 2:
                    int dequeued = dequeue();
                    if (dequeued != -1) {
                        System.out.println(dequeued + " dequeued from queue");
                    }
                    break;
                case 3:
                    int frontValue = peek();
                    if (frontValue != -1) {
                        System.out.println("Front element is " + frontValue);
                    }
                    break;
                case 4:
                    boolean empty = isEmpty();
                    if (empty) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
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
