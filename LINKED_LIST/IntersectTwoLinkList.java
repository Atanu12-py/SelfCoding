package LINKED_LIST;

public class IntersectTwoLinkList {
    // static Node head;
    static class Node{
        int data;
        Node next;
        
    }
    public static Node intersection(Node tmp1,Node tmp2){
        if (tmp1==null || tmp2==null){
            return null;
        }
        if(tmp1.data<tmp2.data){
            return intersection(tmp1.next, tmp2);
        }
        if(tmp1.data>tmp2.data){
            return intersection(tmp1, tmp2.next);
        }
        Node temp=new Node();
        temp.data=tmp1.data;
        temp.next=intersection(tmp1.next, tmp2.next);
        return temp;
    }
    public static Node push(Node head1,int new_data){
        Node new_node=new Node();
        new_node.data=new_data;
        new_node.next=head1;
        head1=new_node;
        return head1;
    }
    public static void print(Node node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
    public static void main(String[] jwgd){
        Node n1=null;
        n1=push(n1,6);
        n1=push(n1,5);
        n1=push(n1,4);
        n1=push(n1,3);
        n1=push(n1,2);
        n1=push(n1,1);

        Node n2=null;
        n2=push(n2,8);
        n2=push(n2,6);
        n2=push(n2,4);
        n2=push(n2,2);

        Node inter=null;
        inter=intersection(n1,n2);
        print(inter);
    }
}
