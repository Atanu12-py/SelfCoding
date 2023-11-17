package BST;

import java.util.HashSet;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Check_If_Two_BST_Is_Same {
    Node root;

    static void insertHashset(Node node, HashSet<Integer> s) {
        if (node == null) {
            return;
        }
        insertHashset(node.left, s);
        s.add(node.data);
        insertHashset(node.right, s);
    }

    static boolean checkIsSame(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
            return false;
        }

        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();

        insertHashset(root1, s1);
        insertHashset(root2, s2);
        return s1.equals(s2);
    }
    Node insert(Node node,int data){
        if(node==null){
            node=new Node(data);
            return node;
        }
        if(data<node.data){
            node.left=insert(node.left, data);
        }
        else{
            node.right=insert(node.right, data);
        }
        return node;

    }
    public static void main(String[] wbd){
        Check_If_Two_BST_Is_Same bst=new Check_If_Two_BST_Is_Same();
        Check_If_Two_BST_Is_Same bst2=new Check_If_Two_BST_Is_Same();
        bst.root=new Node(10);
        bst.insert(bst.root, 8);
        bst.insert(bst.root, 5);
        bst.insert(bst.root, 9);
        bst.insert(bst.root, 12);
        bst.insert(bst.root, 15);
        bst.insert(bst.root, 11);


        bst2.root=new Node(11);
        bst2.insert(bst2.root, 8);
        bst2.insert(bst2.root, 5);
        bst2.insert(bst2.root, 9);
        bst2.insert(bst2.root, 12);
        bst2.insert(bst2.root, 15);
        bst2.insert(bst2.root, 19);

        System.out.println(checkIsSame(bst.root, bst2.root));
    }
}
