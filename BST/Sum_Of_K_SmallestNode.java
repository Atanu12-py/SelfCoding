package BST;


class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class Sum_Of_K_SmallestNode {
    Node root;
    int count=0;
    int sum=0;
    void kSum(Node node,int k){
        if(node==null){
            return;
        }
        kSum(node.left, k);
        if(count<k){
            sum+=node.data;
            count++;
        }
        kSum(node.right, k);
    }
    public static void main(String[] jhc){
        Sum_Of_K_SmallestNode bst=new Sum_Of_K_SmallestNode();
        bst.root=new Node(10);
        bst.root.left=new Node(8);
        bst.root.right=new Node(15);
        bst.root.left.left=new Node(6);
        bst.root.left.right=new Node(9);
        bst.root.right.left=new Node(13);
        bst.root.right.right=new Node(20);

        bst.kSum(bst.root, 4);
        System.out.println(bst.sum);
    }
}
