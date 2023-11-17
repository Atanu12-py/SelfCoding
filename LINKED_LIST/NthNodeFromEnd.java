package LINKED_LIST;

public class NthNodeFromEnd {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public void printFromEnd(int n){
        Node main_ptr=head;
        Node ref_ptr=head;
        int count=0;
        if(head!=null){
            while(count<n){
                if(ref_ptr==null){
                    System.out.println(n+" is greater than number of element in the list");
                    return;
                }
                ref_ptr=ref_ptr.next;
                count++;
            }
            if(ref_ptr==null){
                System.out.println("Node no "+n+" from last is "+head.data);
            }
            else{
                while(ref_ptr!=null){
                    main_ptr=main_ptr.next;
                    ref_ptr=ref_ptr.next;
                }
                System.out.println("Node no "+n+" from last is "+main_ptr.data);
            }
        }
    }
    
    public static void main(String[] wjbd){
        NthNodeFromEnd list=new NthNodeFromEnd();
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(35);

        list.printFromEnd( 0);
    }
}

