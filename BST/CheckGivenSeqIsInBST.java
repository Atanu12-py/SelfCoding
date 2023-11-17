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

public class CheckGivenSeqIsInBST {
    static int count=0;
    Node root;
    // CheckGivenSeqIsInBST(){
    //     root=null;
    // }
    void insert(int key){
        root=insertutil(root, key);
    }
    Node insertutil(Node node,int data){
        if(node==null){
            root=new Node(data);
            return root;
        }
        if(data>node.data){
            node.right=insertutil(node.right,data);
        }
        else{
            node.left=insertutil(node.left, data);
        }
        return node;

    }

//************************************************* */
    Node insert1(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        } else if (key > node.data) {
            node.right = insert1(node.right, key);
        } else {
            node.left = insert1(node.left, key);
        }
        return node;

    }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

//**************************************** */



    void isSeqPresent(Node node,int arr[]){
        if(node==null){
            return;
        }
        isSeqPresent(node.left, arr);
        if(count<arr.length && node.data==arr[count]){
            count++;
        }
        isSeqPresent(node.right, arr);
    }

    boolean ispresent(Node node,int arr[],int n){
        isSeqPresent(node, arr);
        return count==n;
    }
    public static void main(String[] jeb){
        CheckGivenSeqIsInBST bst=new CheckGivenSeqIsInBST();
        // bst.insert(8);
        // bst.insert(10);
        // bst.insert(3);
        // bst.insert(6);
        // bst.insert(1);
        // bst.insert(7);
        // bst.insert(4);
        // bst.insert(14);
        // bst.insert(13);

        // int arr[]={4, 6, 8};
        // boolean bol=bst.ispresent(bst.root, arr, arr.length);
        // System.out.println(bol);


        // bst.root=null;
        bst.root=new Node(50);
        // bst.insert1(bst.root, 50);
        bst.insert1(bst.root, 30);
        bst.insert1(bst.root, 40);
        bst.insert1(bst.root, 20);
        bst.insert1(bst.root, 60);
        bst.insert1(bst.root, 55);
        bst.insert1(bst.root, 70);
        bst.insert1(bst.root, 45);
        bst.insert1(bst.root, 35);

        int arr1[]={40,45,50,55};
        boolean bol1 =bst.ispresent(bst.root, arr1, arr1.length);
        System.out.println(bol1);
        // bst.inorder(bst.root);
        System.out.println(bst.root.data);

    }
}

