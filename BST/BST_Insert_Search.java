package BST;

import java.util.Stack;

public class BST_Insert_Search {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    public void stackinsert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return;
        }
        Node prev = null;
        Node temp = root;
        while (temp != null) {
            if (temp.data > key) {
                prev = temp;
                temp = temp.left;
            } else {
                prev = temp;
                temp = temp.right;
            }
        }
        if (prev.data > key) {
            prev.left = node;
        } else {
            prev.right = node;
        }
    }

    public void stackinorder() {
        Stack<Node> stack = new Stack<Node>();
        Node temp = root;
        while (temp != null || !stack.isEmpty()) {
            if(temp!=null){
                stack.add(temp);
                temp=temp.left;
            }
            else{
                temp=stack.pop();
                System.out.println(temp.data);
                temp=temp.right;
            }
        }
    }

    // BST_Insert_Search(){
    // root=null;
    // }
    Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            root.left = insert(root.left, key);
        }
        return root;

    }

    // void insertmain(int key){
    // root=insert(root, key);
    // }
    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String[] efg) {

        BST_Insert_Search bst = new BST_Insert_Search();
        // bst.root = new Node(50);
        // bst.insert(bst.root, 30);
        // bst.insert(bst.root, 40);
        // bst.insert(bst.root, 20);
        // bst.insert(bst.root, 60);
        // bst.insert(bst.root, 55);
        // bst.insert(bst.root, 70);
        // bst.insert(bst.root, 45);
        // bst.insert(bst.root, 35);

        // bst.inorder(bst.root);

        bst.stackinsert(10);
        bst.stackinsert(30);
        bst.stackinsert(50);
        bst.stackinsert(60);
        bst.stackinsert(40);
        bst.stackinsert(75);
        bst.stackinsert(80);
        // bst.stackinsert(45);
        // bst.stackinsert(35);

        bst.stackinorder();
    }

}
