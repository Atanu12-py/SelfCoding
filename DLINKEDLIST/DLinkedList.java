package DLINKEDLIST;

public class DLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    public void insetAfter(Node prev, int data) {
        if (prev == null) {
            System.out.println("prev node can not be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prev.next;
        prev.next = new_node;
        new_node.prev = prev;
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }

    public void insertBefore(Node nextNode, int data) {
        if (nextNode == null) {
            System.out.println("Next node can not be null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = nextNode;
        new_node.prev = nextNode.prev;
        nextNode.prev = new_node;
        if (new_node.prev != null) {
            new_node.prev.next = new_node;
        } else {
            head = new_node;
        }
    }

    public void append(int data) {
        Node new_Node = new Node(data);
        new_Node.next = null;
        Node last = head;
        if (head == null) {
            new_Node.prev = null;
            head = new_Node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_Node;
        new_Node.prev = last;

    }

    public void print() {
        Node temp = head;
        Node last = null;
        System.out.println("......................");
        while (temp != null) {
            System.out.print(temp.data + " ");
            last = temp;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("***********");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
        System.out.println(".....................");
    }
    public static void main(String[] jbd){
    DLinkedList dlink=new DLinkedList();
    dlink.push(6);
    dlink.push(5);
    dlink.push(4);
    dlink.push(3);
    dlink.push(2);
    dlink.push(1);
    dlink.print();

    dlink.append(7);
    dlink.append(8);
    dlink.print();

    // dlink.insertBefore(dlink.head.next.next.next, 30);
    dlink.insertBefore(dlink.head, 10);
    dlink.print();

    dlink.insetAfter(dlink.head, 111);
    dlink.print();
    }
}
