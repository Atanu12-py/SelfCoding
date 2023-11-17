import java.util.Scanner;

class Node{
    int val;
    Node left;
    Node right;
    Node(int data){
        val=data;
        left=null;
        right=null;
    }
}
public class Height_Tree {
    public static Node buildTree(Node root){
        System.out.println("Enter root");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==-1){
            return null;
        }
        root=new Node(n);
        System.out.println("Enter data for left of"+n);
        root.left=buildTree(root.left);
        System.out.println("Enter data for right of "+n);
        root.right=buildTree(root.right);
        return root;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(leftHeight>rightHeight){
            return leftHeight+1;
        }
        else{
            return rightHeight+1;
        }
    }
    public static void main(String[] args) {
        Node root=null;
        root=buildTree(root);
        System.out.println(height(root));
    }

}
