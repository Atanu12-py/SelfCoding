package BINARY_TREE;

import java.util.Stack;

class Tree {
    int data;
    Tree left, right;

    Tree(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class InorderWithOutRec {
    Tree root;

    public void inOrder() {
        if (root == null) {
            return;
        }
        Stack<Tree> s = new Stack<Tree>();
        Tree curr = root;
        while (curr != null || s.size() > 0) {
            while (curr != null) {
                s.add(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;
        }
    }
    public static void main(String[] jeb){
        InorderWithOutRec tree=new InorderWithOutRec();
        tree.root=new Tree(1);
        tree.root.left=new Tree(2);
        tree.root.left.left=new Tree(4);
        tree.root.left.right=new Tree(5);
        tree.root.right=new Tree(3);

        tree.inOrder();
    }
}
