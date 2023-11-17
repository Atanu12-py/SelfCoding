package BST;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class KthSmallest{
    static int count=0;
    public static Node insert(Node root,int x){
        if(root==null){
            return new Node(x);
        }
        if(x<root.data){
            root.left=insert(root.left, x);
        }
        else if(x>root.data){
            root.right=insert(root.right, x);
        }
        return root;
    }
    public static Node kthsmall(Node root,int k){
        if(root==null){
            return null;
        }
        Node left=kthsmall(root.left, k);
        if(left!=null){
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return kthsmall(root.right, k);

    }
    public static void print(Node root,int k){
        Node res=kthsmall(root, k);
        if (res == null)
            System.out.println("There are less than k nodes in the BST");
        else
            System.out.println("K-th Smallest Element is " + res.data);
    }
    public static void main(String[] fje){
        // KthSmallest bst=new KthSmallest();
        Node root=null;
        int arr[]={20, 8, 22, 4, 12, 10, 14};
        for(int i=0;i<arr.length;i++){
            insert(root, arr[i]);
        }
        int k=3;
        print(root, k);
        
    }
}