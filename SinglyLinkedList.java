import java.util.*;

public class SinglyLinkedList {
    Node head;

    // Node class
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insert
    public void insert(int newData) {
        Node newNode = new Node(newData);
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

    // display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp  = temp.next;
        }
        System.out.println("NULL");
    }

    // delete by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == value) {
            head = head.next;
            System.out.println(value + " deleted");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value " + value + " not found in the list.");
        } else {
            temp.next = temp.next.next;
            System.out.println(value + " deleted");
        }
    }

    // main
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.display();

        list.delete(20);
        list.display();
    }
}