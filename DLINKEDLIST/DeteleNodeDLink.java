package DLINKEDLIST;

class DeleteNodeDLink {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    /**
     * @param del
     */
    public void deleteNode(Node del) {
        if (head == null || del == null) {
            return;
        }
        if (head == del) {
            head = head.next;
            head.prev = null;
        }
        else if(del.next==null){
            del.prev.next=null;
        }
        else if (del.next != null) {
            del.next.prev = del.prev;
            del.prev.next=del.next;
        }
        else if (del.prev != null) {
            del.prev.next = del.next;
            // del.next.prev=del.prev;
        }
        
        return;
    }
    public void swapKthNode(int k){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(k>count){
            return;
        }
        if(2*k-1==count){
            return;
        }

        Node prev_x=null;
        Node x=head;
        for(int i=0;i<k-1;i++){
            prev_x=x;
            x=x.next;
        }

        Node prev_y=null;
        Node y=head;
        for(int i=0;i<count-k;i++){
            prev_y=y;
            y=y.next;
        }

        if(prev_x!=null){
            prev_x.next=y;
            y.prev=prev_x;
        }
        if(prev_y!=null){
            prev_y.next=x;
            x.prev=prev_y;
        }

        Node tempo=x.next;
        x.next=y.next;
        y.next=tempo;

        if(k>1 && k<count){
            x.next.prev=x;
            y.next.prev=y;
        }

        if(k==1){
            head=y;
        }
        if(k==count){
            head=x;
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
    public static void main(String[] jwhd){
        DeleteNodeDLink list=new DeleteNodeDLink();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        list.print();

        // list.deleteNode(list.head);
        // list.print();

        // list.deleteNode(list.head.next.next);
        // list.print();

        // list.deleteNode(list.head.next.next); 
        // list.print();
        list.swapKthNode(2);
        list.print();
    }
}