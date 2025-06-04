class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    // Add a new node at the end
    void add(int n) {
        Node newNode = new Node(n);
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

    // Display all nodes
    void display() {
        Node curr = head;
        if (curr == null) {
            System.out.println("List is empty.");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(8);
        l.add(2);
        l.add(3);
        l.display(); // Output: 1 2 3
    }
}
