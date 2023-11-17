package BINARY_TREE;

public class TreeTraversal {
    Tree root;

    TreeTraversal() {
        root = null;
    }

    static class Tree {
        int data;
        Tree left;
        Tree right;

        Tree(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    public void inOrder(Tree root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(Tree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Tree root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] jwb) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Tree(1);
        tree.root.left = new Tree(2);
        tree.root.left.left = new Tree(4);
        tree.root.left.left.left = new Tree(14);
        tree.root.left.left.right = new Tree(140);
        tree.root.left.right = new Tree(5);
        tree.root.left.right.left = new Tree(50);
        tree.root.left.right.right = new Tree(60);
        tree.root.right = new Tree(3);
        tree.root.right.left = new Tree(6);
        tree.root.right.right = new Tree(7);

        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

    }
}

