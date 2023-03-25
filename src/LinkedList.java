//Program for Linklist, use user-defined functions to perform actions

import java.util.Scanner;

public class LinkedList {
    private Node head;

    // Node class definition
    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // constructor
    public LinkedList() {
        head = null;
    }

    // add a node to the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // delete a node from the linked list
    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("Error: Linked list is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data == data) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Error: Node not found");
    }

    // display the linked list
    public void displayList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // main function
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int choice, data;

        do {
            // display menu
            System.out.println("Linked List Operations");
            System.out.println("1. Add Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            // perform user's choice
            switch (choice) {
                case 1:
                    System.out.print("Enter data to add: ");
                    data = input.nextInt();
                    list.addNode(data);
                    break;
                case 2:
                    System.out.print("Enter data to delete: ");
                    data = input.nextInt();
                    list.deleteNode(data);
                    break;
                case 3:
                    list.displayList();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
