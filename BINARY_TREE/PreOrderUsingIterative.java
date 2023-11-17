package BINARY_TREE;

import java.util.Stack;

public class PreOrderUsingIterative {
    Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    public void preorder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> st=new Stack<Node>();
        st.push(root);
        while(st.isEmpty()==false){
            Node mynode=st.peek();
            System.out.println(mynode.data+" ");
            st.pop();
            if(mynode.right!=null){
                st.push(mynode.right);
            }
            if(mynode.left!=null){
                st.push(mynode.left);
            }
        }
    }
    public void postorder(Node root){
        if(root==null){
            return;
        }
    }
    public static void main(String[] duge){
        PreOrderUsingIterative node=new PreOrderUsingIterative();
        node.root=new Node(10);
        node.root.left=new Node(20);
        node.root.right=new Node(30);
        node.root.left.left=new Node(40);
        node.root.left.right=new Node(50);

        node.preorder(node.root);
    }
}
