package LINKED_LIST;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class SearchEleLinkList {
    Node head;
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public boolean search(Node heaad,int data){
        Node temp=heaad;
        if(temp==null){
            return false;
        }
        if(temp.data==data){
            return true;
        }
        return search(heaad.next,data);
    }
    public static void main(String[] jwb){
        SearchEleLinkList list=new SearchEleLinkList();
        list.push(11);
        list.push(12);
        list.push(13);
        list.push(14);
        list.push(15);

        System.out.println(list.search(list.head, 13));
    }
}
