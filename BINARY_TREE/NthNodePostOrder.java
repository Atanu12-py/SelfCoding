package BINARY_TREE;

public class NthNodePostOrder {
    Node root;
    static int count = 0;

    NthNodePostOrder() {
        root = null;
    }

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

    public void nthNode(Node root, int n) {
        if (root == null) {
            return;
        }
        if (count <= n) {
            nthNode(root.left, n);
            nthNode(root.right, n);
            count++;
            if (count == n) {
                System.out.println(root.data);
            }
        }
    }

    public static void main(String[] jgd) {
        NthNodePostOrder node = new NthNodePostOrder();
        node.root = new Node(10);
        node.root.left = new Node(20);
        node.root.right = new Node(30);
        node.root.left.left = new Node(40);
        node.root.left.right = new Node(50);

        node.nthNode(node.root, 4);
    }
}
