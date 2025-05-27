// leetcode hard problem
// for a given k value(k>0) reverse blocks of k nodes in a singly linked list
// input: K=2: 1 2 3 4 5 6 7 8 9 10
// output: 2 1 4 3 6 5 8 7 10 9 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class revKnodes {
    Node head;

    public void insert(int data) {
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

    public void reverseKNodes(int k) {
        head = reverseKNodes(head, k);
    }

    private Node reverseKNodes(Node head, int k) {
        Node current = head;
        Node prevTail = null;
        Node newHead = null;

        while (current != null) {
            Node groupHead = current;
            Node prev = null;
            int count = 0;

            // Reverse k nodes
            while (current != null && count < k) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
                count++;
            }

            // If this is the first group, set newHead
            if (newHead == null) {
                newHead = prev;
            }

            // Connect the previous group's tail to the current group's head
            if (prevTail != null) {
                prevTail.next = prev;
            }

            // Update the previous tail to the group head
            prevTail = groupHead;

            // If there are fewer than k nodes left, connect them as is
            if (count < k) {
                groupHead.next = current; // Connect remaining nodes
                break; // Exit loop as we can't form another full group
            }
        }
        return newHead; // Return the new head of the reversed list
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        revKnodes list = new revKnodes();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int value : values) {
            list.insert(value);
        }

        System.out.println("Original List:");
        list.printList();

        int k = 2; // Change this value to reverse different block sizes
        list.reverseKNodes(k);
        System.out.println("List after reversing every " + k + " nodes:");
        list.printList();
    }
} 