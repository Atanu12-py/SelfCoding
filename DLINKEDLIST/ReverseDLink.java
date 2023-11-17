package DLINKEDLIST;
public class ReverseDLink {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }
    public void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        new_node.prev=null;
        if(head!=null){
            head.prev=new_node;
        }
        head=new_node;
    }
    public void reverse(){
        Node current=head;
        Node temp=null;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] wjbd){
        ReverseDLink list=new ReverseDLink();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.print();

        list.reverse();
        list.print();
    }
}
