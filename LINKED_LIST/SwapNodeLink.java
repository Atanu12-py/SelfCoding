package LINKED_LIST;

public class SwapNodeLink {
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
    Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void swap(int x,int y){
        Node prevx=null,currentx=head;
        while(currentx!=null && currentx.data!=x){
            prevx=currentx;
            currentx=currentx.next;
        }
        Node prevy=null,currenty=head;
        while(currenty!=null && currenty.data!=y){
            prevy=currenty;
            currenty=currenty.next;
        }
        if(currentx==null || currenty==null){
            return;
        }

        if(prevx!=null){
            prevx.next=currenty;
        }
        else{
            head=currenty;
        }
        if(prevy!=null){
            prevy.next=currentx;
        }
        else{
            head=currentx;
        }

        Node temp=currentx.next;
        currentx.next=currenty.next;
        currenty.next=temp;
    }
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] jb){
        SwapNodeLink list=new SwapNodeLink();
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.swap(1, 5);
        list.print();
    }
}
