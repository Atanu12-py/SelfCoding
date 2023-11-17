import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    Node(int d) {
        key = d;
        left = null;
        right = null;
    }
}

public class BST_Intro {

    Node suc=null;
    Node pre=null;

    Node root;

    BST_Intro() {
        root = null;
    }

    Node insert(Node node, int data) {
        if (node == null) {
            Node root = new Node(data);
            return root;
        }
        if (data > node.key) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }
        return node;
    }

    Node takeInput(Node node) {
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        data = sc.nextInt();
        while (data != -1) {
            node = insert(node, data);
            System.out.println("input");
            data = sc.nextInt();
        }
        return node;
    }

    void levelOrder(Node root) {
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
                System.out.print(temp.key + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + " ");
    }

    Node minvalue(Node node){
        Node temp=node;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }
    Node maxvalue(Node node){
        Node temp=node;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp;
    }

    void findpresuc(Node root,int val){
        if(root==null){
            return;
        }
        if(root.key==val){
            if(root.left!=null){
                Node temp=root.left;
                while(temp.right!=null){
                    temp=temp.right;
                }
                pre=temp;
            }
            if(root.right!=null){
                Node temp=root.right;
                while (temp.left!=null) {
                    temp=temp.left;
                }
                suc=temp;
            }
            return;
        }
        if(root.key>val){
            suc=root;
            findpresuc(root.left, val);
        }
        else{
            pre=root;
            findpresuc(root.right, val);
        }
    }

    public static void main(String[] args) {
        BST_Intro tree = new BST_Intro();
        Node root = tree.takeInput(tree.root);
        tree.levelOrder(root);
        System.out.println();

        tree.inorder(root);
        System.out.println();

        tree.preorder(root);
        System.out.println();

        tree.postorder(root);
        System.out.println();

        System.out.println(tree.minvalue(root).key);
        System.out.println(tree.maxvalue(root).key);

        tree.findpresuc(root, 13);
        System.out.println(tree.suc+" "+tree.pre.key);
    }
}