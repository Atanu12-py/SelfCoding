import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    Node(int data) {
        val = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    public static Node buildtree(Node root) {
        System.out.println("Enter the data");
        int data;
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter data for left of " + data);
        root.left = buildtree(root.left);
        System.out.println("Enter data for rigth of " + data);
        root.right = buildtree(root.right);
        return root;
    }

    public static void levelOrdertraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(temp.val + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }

            }
        }
    }

    public static void reverseLevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        Stack<Node> st = new Stack<>();

        q.add(root);
        // q.add(null);


        while (!q.isEmpty()) {
            Node temp = q.poll();
            st.add(temp);
            // if(temp==null){
            //     if(!q.isEmpty()){
            //         q.add(null);
            //     }
            // }
            // else{

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            // }
        }
        while(!st.isEmpty()){
            // if(st.pop()==null){
            //     System.out.println();
            // }
            // else{
                Node t=st.pop();
                System.out.print(t.val+" ");
            // }
        }
    }
    public static void inorder(Node root){
             if(root==null){
                return;
             }
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    static Node buildTreeFromLevelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root");
        int n=sc.nextInt();
        root=new Node(n);
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            
            System.out.println("Enter left of "+temp.val);
            int leftData;
            leftData=sc.nextInt();
            if(leftData!=-1){
                temp.left=new Node(leftData);
                q.add(temp.left);
            }
            System.out.println("Enter right of "+temp.val);
            int righttData;
            righttData=sc.nextInt();
            if(righttData!=-1){
                temp.right=new Node(righttData);
                q.add(temp.right);
            } 
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        // root = buildtree(root);
        root=buildTreeFromLevelOrder(root);
        levelOrdertraversal(root);
        reverseLevelOrder(root);

        System.out.println();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}