package BINARY_TREE;

public class ReverseLevelOrder {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight) {
                return lheight + 1;
            } else {
                return rheight + 1;
            }
        }
    }

    public void printcurrentlevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data+"  ");
        } 
        else {
            printcurrentlevel(root.right, level - 1);
            printcurrentlevel(root.left, level - 1);
        }
    }

    public void printlevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printcurrentlevel(root, i);
        }
    }
    void reverseLevelOrder(){
        int h=height(root);
        int i;
        for(i=h;i>=1;i--){
            printcurrentlevel(root, i);
        }
    }

    public static void main(String[] jeb) {
        ReverseLevelOrder node = new ReverseLevelOrder();
        node.root = new Node(10);
        node.root.left = new Node(20);
        node.root.right = new Node(30);
        node.root.left.right = new Node(40);

        // System.out.println(node.height(node.root));
        node.printlevelOrder();
        node.reverseLevelOrder();
    }
}
