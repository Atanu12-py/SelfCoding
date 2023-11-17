package BST;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class Index{
    int index=0;
}
public class BST_From_PreOrder {
    Node root;
    // int index=0;
    Index index=new Index();    
    Node constuctbst(int pre[],Index preindex,int low,int high,int size){
    // Node constuctbst(int pre[],int low,int high,int size){
        if(preindex.index>=size || low>high){
        // if(index>=size || low>high){
            return null;
        }
        Node root=new Node(pre[preindex.index++]);
        // Node root=new Node(pre[index++]);
        if(low==high){
            return root;
        }
        int i;
        for(i=low;i<=high;i++){
            if(pre[i]>root.data){
                break;
            }
        }
        root.left=constuctbst(pre, preindex,preindex.index, i-1, size);
        // root.left=constuctbst(pre,index, i-1, size);
        root.right=constuctbst(pre,preindex, i, high, size);
        // root.right=constuctbst(pre, i, high, size);
        return root;
    }
    public Node constuct(int pre[],int size){
        return constuctbst(pre, index, 0, size-1, size);
        // return constuctbst(pre, 0, size-1, size);
    }
    public void printInorder(Node root){
        if(root==null){
            return;
        }
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    public static void main(String[] jb){
        BST_From_PreOrder bst=new BST_From_PreOrder();
        int pre[]={10, 5, 1, 7, 40, 50};
        // int pre[]={10, 30,50,60,40,70,80};
        int size=pre.length;
        Node root=bst.constuct(pre, size);
        bst.printInorder(root);
    }
}



