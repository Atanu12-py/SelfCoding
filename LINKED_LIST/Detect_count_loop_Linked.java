package LINKED_LIST;


class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class Detect_count_loop_Linked {
    Node head;
    
    void detect_loop(){
        Node slow_p=head;
        Node fast_p=head;
        int count=0;
        int flag=0;
        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            count++;
            if(slow_p==fast_p){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Loop is found and length of the loop is "+count);
        }
        else{
            System.out.println("Loop not detected");
        }
    }
    public static void main(String[] wjbd){
        Detect_count_loop_Linked list=new Detect_count_loop_Linked();
        // list.head=
        // Node first=new Node(1);
        // list.head=first;
        list.head=new Node(1);
        Node second=new Node(2);
        Node third = new Node(3);
        Node fourth= new Node(4);
        Node five=new Node(5);

        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;

        list.head.next.next.next.next.next=second;
        list.detect_loop();
    }
}
