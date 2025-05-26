// Write a code that performs sorting of a given singly linked list where the node contains 0s, 1s, and 2s
// input = 1 1 0 2 1 0 2 0 1 1 0 2 0 2
// output = 0 0 0 0 0 1 1 1 1 1 2 2 2 2

import java.util.Scanner;
class single_ll{
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void sortList() {
        Node zeroHead = new Node(0), oneHead = new Node(0), twoHead = new Node(0);
        Node zeroTail = zeroHead, oneTail = oneHead, twoTail = twoHead;

        Node current = head;
        while (current != null) {
            if (current.data == 0) {
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            } else if (current.data == 1) {
                oneTail.next = current;
                oneTail = oneTail.next;
            } else {
                twoTail.next = current;
                twoTail = twoTail.next;
            }
            current = current.next;
        }

        // Connect the three lists
        zeroTail.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;

        // Set the head to the start of the sorted list
        head = zeroHead.next;
    }

    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input linked list
        System.out.println("Enter elements of the linked list (0s, 1s, and 2s), end with -1:");
        while (true) {
            int value = sc.nextInt();
            if (value == -1) break; // End input
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Sort the linked list
        sortList();

        // Print the sorted linked list
        System.out.println("Sorted linked list:");
        printList();
        
        sc.close();
    }
}
