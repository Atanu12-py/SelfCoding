package BST;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Inorder_Succ_Pre_OfKey {
    Node root;
    Node succ = null;
    Node pre = null;

    /**
     * @param node
     * @param key
     */
    void findsuccpre(Node node, int key) {
        if (node == null) {
            return;
        }
        if (node.data == key) {
            if (node.left != null) {
                Node temp = node.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                pre = temp;
            }
            if (node.right != null) {
                Node temp = node.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                succ = temp;
            }
            return;
        }
        if (node.data > key) {
            succ = node;
            findsuccpre(node.left, key);
        } else {
            pre = node;
            findsuccpre(node.right, key);
        }
    }

    public static void main(String[] hhd) {
        Inorder_Succ_Pre_OfKey bst = new Inorder_Succ_Pre_OfKey();

        bst.root = new Node(10);
        bst.root.left = new Node(8);
        bst.root.left.left = new Node(4);
        bst.root.left.left.left = new Node(1);
        bst.root.left.left.right = new Node(5);
        bst.root.left.right = new Node(9);

        bst.root.right = new Node(15);
        bst.root.right.left = new Node(12);
        bst.root.right.left.left = new Node(11);
        bst.root.right.left.right = new Node(14);
        bst.root.right.right = new Node(20);
        bst.root.right.right.left = new Node(17);
        bst.root.right.right.right = new Node(22);

        bst.findsuccpre(bst.root, 8);
        System.out.println(bst.succ.data);
        System.out.println(bst.pre.data);
    }
}
