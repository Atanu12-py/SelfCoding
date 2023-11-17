public class Delete_node {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void delete(int key){
        Node temp=head;
        Node prev=null;
        if(temp!=null && temp.data==key){
            head=temp.next;
            temp=null;
            return;
        }
        while(temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        prev.next=temp.next;
        // temp=null;
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] jwbd){
        Delete_node list=new Delete_node();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.printlist();
        System.out.println();
        list.delete(2);
        list.printlist();
    }
}
