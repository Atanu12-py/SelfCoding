package LINKED_LIST;

public class LinkListInsertion {
    Node head;
    static class Node{
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
    public void append(int new_data){
        if(head==null){
            head=new Node(new_data);
            return;
        }
        Node new_node=new Node(new_data);
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=new_node;
        new_node.next=null;
        return;

    }
    public void insertAfter(Node prev_node,int new_data){
        if(prev_node==null){
            System.out.println("Given previous node can not be null");
            return;
        }
        Node new_node=new Node (new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;

    }
    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] sjbd){
        LinkListInsertion list=new LinkListInsertion();
        list.push(1);
        list.push(111);
        list.push(10);
        list.push(12);
        list.append(2);
        list.insertAfter(list.head.next, 22);
        list.printlist();
    }
    
}
