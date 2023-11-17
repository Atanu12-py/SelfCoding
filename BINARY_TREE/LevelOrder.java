package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
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

    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();
            if (temp == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public static void main(String[] jebf) {
        LevelOrder node = new LevelOrder();
        node.root = new Node(10);
        node.root.left = new Node(20);
        node.root.right = new Node(30);
        node.root.left.left = new Node(40);
        node.root.left.right = new Node(50);
        node.root.right.left = new Node(60);
        node.root.right.right = new Node(70);

        node.levelOrder(node.root);

    }
}
