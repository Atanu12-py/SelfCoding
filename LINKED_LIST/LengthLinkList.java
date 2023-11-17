package LINKED_LIST;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LengthLinkList {
    Node head;

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public int getCount(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getCount(node.next);
    }

    public int getCountOri() {
        return getCount(head);
    }

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node dummy=new Node(0);
		if(list1 == null) return list1;
		if(list2 == null) return list2;
		
		if(list1.data < list2.data)
		{
			dummy.next = mergeTwoLists(list1.next, list2);
			
		}
		else
		{
			dummy.next = mergeTwoLists(list1, list2.next);
			//return B;
		}
        return dummy.next;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] wjd){
        LengthLinkList list=new LengthLinkList();
        // list.push(1);
        // list.push(1);
        // list.push(1);
        // list.push(1);

        // System.out.println(list.getCountOri());


        list.push(4);
        list.push(2);
        list.push(1);

        LengthLinkList list2=new LengthLinkList();
        list2.push(4);
        list2.push(3);
        list2.push(1);

        Node h=mergeTwoLists(list.head, list2.head);
        print(h.next);

    }
}
