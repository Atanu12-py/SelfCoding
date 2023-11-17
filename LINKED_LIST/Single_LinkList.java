package LINKED_LIST;
public class Single_LinkList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;

        }

    }
    public void printlist(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }

    }
    public static void main(String[] sjbd){
        Single_LinkList list=new Single_LinkList();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);

        list.head.next=second;
        second.next=third;
        third.next=fourth;
        list.printlist();
    }
}
