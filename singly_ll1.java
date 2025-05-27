// write a function that performs singly linked list deletion at begin, end
// write a function that performs singly linked list deletion of a given node
// input = 11 56 78 9 23 46 71 81 99 17
// output = 9 11 17 23 46 56 71 78 81 99

import java.util.Scanner;
class singly_ll1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        
        for (String num : numbers) {
            insert(Integer.parseInt(num));
        }
        
        display();
    }
    // Function to delete a node at the beginning
    public static void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }
    // Function to delete a node at the end
    public static void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    // Function to delete a specific node
    public static void deleteNode(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Node with value " + key + " not found.");
        } else {
            current.next = current.next.next;
        }
    }
    // Function to sort the linked list
    public static void sort() {
        if (head == null || head.next == null) {
            return; // List is empty or has only one element
        }
        Node current = head;
        Node index = null;
        int temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
    // Function to sort and display the linked list
    public static void sortAndDisplay() {
        sort();
        display();
    }
}