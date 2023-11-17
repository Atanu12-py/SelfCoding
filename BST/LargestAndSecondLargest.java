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

public class LargestAndSecondLargest {
    Node root;
    static int count = 0;

    LargestAndSecondLargest() {
        root = null;
    }

    public void insert(int data) {
        root = insertrec(root, data);
    }

    Node insertrec(Node node, int data) {
        if (node == null) {
            root = new Node(data);
            return root;
        }
        if (data > node.data) {
            node.right = insertrec(node.right, data);
        } else {
            node.left = insertrec(node.left, data);
        }
        return node;
    }

    Node largest(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }

    void secondlargest(Node root, int K) {
        if (root == null || count >= K) {
            return;
        }
        secondlargest(root.right, K);
        count++;
        if (count == K) {
            System.out.println("Second largest node is " + root.data);
        }
        secondlargest(root.left, K);
    }
    static int coun1=0;
    void KthSmall(Node root, int k) {
        if (root == null || coun1 >= k) {
            return;
        }
        KthSmall(root.left, k);
        coun1++;
        if (coun1 == k) {
            System.out.println("Kth smallest node is " + root.data);
        }
        KthSmall(root.right, k);
    }

    public static void main(String[] je) {
        LargestAndSecondLargest bst = new LargestAndSecondLargest();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        Node tree = bst.largest(bst.root);
        System.out.println(tree.data);

        bst.secondlargest(bst.root, 5);

        bst.KthSmall(bst.root, 5);
    }

}
