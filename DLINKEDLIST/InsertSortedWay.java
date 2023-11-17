package DLINKEDLIST;

public class InsertSortedWay {
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
    public void insert(int new_data){
        Node temp=head;
        if(temp==null){
            Node new_node=new Node(new_data);
            head=new_node;
            return;
        }
        else if(new_data<temp.data){
            Node new_node=new Node(new_data);
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
        }
        while(temp.next!=null && temp.next.data<new_data){
            temp=temp.next;
        }
        Node new_node=new Node(new_data);
        new_node.next=temp.next;
        if(temp.next!=null){
        temp.next.prev=new_node;
        }
        temp.next=new_node;
        new_node.prev=temp;
    }
    public void print(){
        Node head1=head;
        while(head1!=null){
            System.out.println(head1.data);
            head1=head1.next;
        }
        System.out.println();
    }
    public static void main(String[] ejg){
        InsertSortedWay list=new InsertSortedWay();
        list.push(5);
        list.push(4);
        list.push(2);
        list.push(1);
        list.print();

        list.insert(3);
        list.print();
    }
}
