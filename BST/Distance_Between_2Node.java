package BST;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class Distance_Between_2Node {
    Node root;
    Node insert(Node node,int data){
        if(node==null){
            node=new Node(data);
            return node;
        }
        if(node.data>data){
            node.left=insert(node.left, data);
        }
        else{
            node.right=insert(node.right, data);
        }
    return node;
    }
    int distanceFromRoot(Node node,int x){
        if(node.data==x){
            return 0;
        }
        else if(node.data>x){
            return 1+distanceFromRoot(node.left, x);
        }
        return 1+distanceFromRoot(node.right, x);
    }
    int distancebetween2(Node node,int a,int b){
        if(node==null){
            return 0;
        }
        if(node.data>a && node.data>b){
            return distancebetween2(node.left, a, b);
        }
        if(node.data<a && node.data<b){
            return distancebetween2(node.right, a, b);
        }
        if(node.data>=a && node.data<=b){
            return distanceFromRoot(node, a) + distanceFromRoot(node, b);
        }
        return 0;
    }
    public static void main(String[] kwd){
        Distance_Between_2Node bst=new Distance_Between_2Node();
        bst.root=new Node(20);
        bst.insert(bst.root, 10);
        bst.insert(bst.root, 5);
        bst.insert(bst.root, 15);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 25);
        bst.insert(bst.root, 35);

        System.out.println(bst.distancebetween2(bst.root, 20, 35));
    }
}
