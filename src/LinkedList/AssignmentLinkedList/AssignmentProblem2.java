package LinkedList.AssignmentLinkedList;

import java.util.LinkedList;

import java.io.*;

class Node {
    int data;
    Node next;
}


public class AssignmentProblem2 {
    Node head;

    void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println
            ("The given previous node cannot be NULL");
            return;
        }


        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    void push(int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    	AssignmentProblem2 llist = new AssignmentProblem2();


        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(2);

        System.out.print("Created Linked list is: ");
        llist.printList();


        llist.insertAfter(llist.head, 3);

        System.out.print("After inserting 1 after 2: ");
        llist.printList();
    }
}


/* Output:
Created Linked list is:  2 4 5 6
After inserting 1 after 2:  2 3 4 5 6
*/