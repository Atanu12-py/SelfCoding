package BST;

class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class IsBstOrNot {
    Node node;
    boolean isBst(Node root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data<min || root.data>max){
            return false;
        }
        return isBst(root.left, min, root.data-1) && isBst(root.right, root.data+1, max);
    }
    public static void main(String[] dv){
        IsBstOrNot bst=new IsBstOrNot();
        bst.node=new Node(4);
        bst.node.left=new Node(2);
        bst.node.right=new Node(5);
        bst.node.left.left=new Node(1);
        bst.node.left.right=new Node(3);

        boolean bol=bst.isBst(bst.node,Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(bol);
    }
}
