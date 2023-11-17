package BST;

class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class PrintNodeGivenRange {
    Node root;
    int count=0;
    void printGivenRange(Node node, int k1, int k2) {
        if (node == null) {
            return;
        }
        printGivenRange(node.left, k1, k2);
        if (k1 <= node.data && k2 >= node.data) {
            System.out.println(node.data);
            count++;
        }
        printGivenRange(node.right, k1, k2);
    }

    public static void main(String[] jeb) {
        PrintNodeGivenRange bst = new PrintNodeGivenRange();
        bst.root = new Node(10);
        bst.root.left=new Node(5);
        bst.root.right=new Node(50);
        bst.root.left.left=new Node(1);
        bst.root.right.left=new Node(40);
        bst.root.right.right=new Node(100);
        // bst.root.left = new Node(8);
        // bst.root.right = new Node(15);
        // bst.root.left.left = new Node(6);
        // bst.root.left.right = new Node(9);
        // bst.root.right.left = new Node(12);
        // bst.root.right.right = new Node(20);

        bst.printGivenRange(bst.root, 5, 45);
        System.out.println(bst.count);

    }
}
