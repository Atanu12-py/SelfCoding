package LINKED_LIST;

import java.util.HashSet;

public class RemoveDupFromUnsorted {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // public void removeDuplicate() {
    // Node ptr1 = head, ptr2 = null;
    // while (ptr1 != null && ptr1.next != null) {
    // ptr2 = ptr1;
    // while (ptr2.next != null) {
    // if (ptr1.data == ptr2.next.data) {
    // ptr2.next = ptr2.next.next;
    // } else {
    // ptr2 = ptr2.next;
    // }
    // }
    // ptr1 = ptr1.next;
    // }
    // }
    public void removeDuplicate() {
        Node current = head;
        Node prev = null;
        HashSet<Integer> hs = new HashSet<>();
        while (current != null) {
            int current_data = current.data;
            if (hs.contains(current_data)) {
                prev.next = current.next;
            } else {
                hs.add(current_data);
                prev = current;
            }
            current = current.next;
        }
        // he.data=20;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] jsb) {
        RemoveDupFromUnsorted list = new RemoveDupFromUnsorted();
        list.push(1);
        list.push(2);
        list.push(1);
        list.push(3);
        list.push(2);

        list.print();

        list.removeDuplicate();
        System.out.println("..............");
        list.print();
    }
}
