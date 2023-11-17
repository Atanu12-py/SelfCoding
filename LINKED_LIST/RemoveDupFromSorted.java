package LINKED_LIST;

// import java.util.HexFormat;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class RemoveDupFromSorted {
    static Node head;

    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public static void removeDuplicate(){
        Node current=head;
        while(current!=null){
            Node temp=current;
            while(temp!=null && (temp.data==current.data)){
                temp=temp.next;
            }
            current.next=temp;
            current=temp;
        }
    }
    public static void remove(){
        Node temp=head;
        Node prev=head;
        while(temp!=null){
            if(temp.data!=prev.data){
                prev.next=temp;
                prev=temp;
            }
            temp=temp.next;
        }
        prev.next=null;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] djh){
        RemoveDupFromSorted list=new RemoveDupFromSorted();
        list.push(4);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(2);
        list.push(1);
        list.push(1);
        list.push(1);

        print();

        // removeDuplicate();
        remove();
        System.out.println("************");

        print();
    }

}
