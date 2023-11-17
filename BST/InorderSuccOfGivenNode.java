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

public class InorderSuccOfGivenNode {
    Node root;

    Node minValue(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    Node inorderSuccessor(Node node, Node n) {
        if (n.right != null) {
            return minValue(n.right);
        }
        Node succ = null;
        while (node != null) {
            if (node.data > n.data) {
                succ = node;
                node = node.left;
            } else if (n.data > node.data) {
                node = node.right;
            } else {
                break;
            }
        }
        return succ;
    }

    public static void main(String[] jdb) {
        InorderSuccOfGivenNode bst = new InorderSuccOfGivenNode();
        bst.root = new Node(10);
        bst.root.left = new Node(8);
        bst.root.left.left = new Node(4);
        bst.root.left.right = new Node(9);
        bst.root.left.left.left = new Node(2);
        bst.root.left.left.right = new Node(5);

        bst.root.right = new Node(15);
        bst.root.right.left = new Node(12);
        bst.root.right.right = new Node(20);
        bst.root.right.left.left = new Node(11);
        bst.root.right.left.right = new Node(14);
        bst.root.right.right.left = new Node(17);
        bst.root.right.right.right = new Node(22);

        Node temp=bst.inorderSuccessor(bst.root, bst.root.right.right);
        System.out.println(temp.data);
    }
}
