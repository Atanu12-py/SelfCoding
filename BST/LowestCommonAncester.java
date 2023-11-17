package BST;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class LowestCommonAncester {
    Node root;
    Node lowestCommAnces(Node root,int n1,int n2){
        // if(root==null){
        //     return null;
        // }
        // if(root.data>n1 && root.data>n2){
        //     return lowestCommAnces(root.left, n1, n2);
        // }
        // if(root.data<n1 && root.data<n2){
        //     return lowestCommAnces(root.right, n1, n2);
        // }

        while(root!=null){
            if(root.data>n1 && root.data>n2){
                root=root.left;
            }
            else if(root.data<n1 && root.data<n2){
                root=root.right;
            }
            else{
                break;
            }
        }
        return root;
    }
    public static void main(String[] neb){
        LowestCommonAncester lca=new LowestCommonAncester();
        lca.root=new Node(20);
        lca.root.left=new Node(8);
        lca.root.right=new Node(22);
        lca.root.left.left=new Node(4);
        lca.root.left.right=new Node(12);
        lca.root.left.right.left=new Node(10);
        lca.root.left.right.right=new Node(14);

        int n1=10,n2=14;
        Node root=lca.lowestCommAnces(lca.root, n1, n2);
        System.out.println(root.data);
    }
}
