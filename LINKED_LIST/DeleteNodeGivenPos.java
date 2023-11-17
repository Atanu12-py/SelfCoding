package LINKED_LIST;

public class DeleteNodeGivenPos {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void deleteGivenPos(int pos) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (pos == 0) {
            head = temp.next;
            return;
        }
        int i = 0;
        while (temp != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] ejb) {
        DeleteNodeGivenPos list = new DeleteNodeGivenPos();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.printlist();
        System.out.println();
        list.deleteGivenPos(2);
        list.printlist();
    }
}
