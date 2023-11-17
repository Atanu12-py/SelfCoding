package BINARY_TREE;

public class NthNodeOfPreorder {
    static int count = 0;
    Node root;

    NthNodeOfPreorder() {
        root = null;
    }

    static class Node {
        int data;
        Node left;
        Node rigth;

        Node(int d) {
            data = d;
            left = null;
            rigth = null;
        }
    }

    public void ntNode(Node root, int n) {
        if (root == null) {
            return;
        }
        if (count <= n) {
            ntNode(root.left, n);
            count++;
            if (count == n) {
                System.out.println(root.data);
            }
            ntNode(root.rigth, n);
        }
    }

    public static void main(String[] jb) {
        NthNodeOfPreorder node = new NthNodeOfPreorder();
        node.root = new Node(10);
        node.root.left = new Node(20);
        node.root.rigth = new Node(30);
        node.root.left.left = new Node(40);
        node.root.left.rigth = new Node(50);

        node.ntNode(node.root, 4);
    }
}
