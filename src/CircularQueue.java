//Program for Circular Queue(use user-defined functions to perform actions)
public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public CircularQueue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        System.out.println(item + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int item = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        System.out.println(item + " dequeued from queue");
        return item;
    }

    public boolean isFull() {
        return ((rear + 1) % capacity == front);
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println(arr[rear]);
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println("Front element is: " + queue.peek());
    }
}
