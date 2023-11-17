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

public class Node_LessThan_Or_Equal_N {
    Node root;

    Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }
        return node;
    }
    int findLessThanN(Node node,int N){
        if(node==null){
            return -1;
        }
        if(node.data==N){
            return N;
        }
        else if(node.data<N){
            int k=findLessThanN(node.right, N);
            if(k==-1){
                return node.data;
            }
            else{
                return k;
            }
        }
        else if(node.data>N){
            return findLessThanN(node.left, N);
        }
        return -1;
    }
    public static void main(String[] ejbf){
        Node_LessThan_Or_Equal_N bst=new Node_LessThan_Or_Equal_N();
        bst.root=new Node(25);
        bst.insert(bst.root, 2);
        bst.insert(bst.root, 1);
        bst.insert(bst.root, 3);
        bst.insert(bst.root, 12);
        bst.insert(bst.root, 9);
        bst.insert(bst.root, 21);
        bst.insert(bst.root, 19);
        bst.insert(bst.root, 25);

        int n=4;
        System.out.println(bst.findLessThanN(bst.root, n));
    }

}
