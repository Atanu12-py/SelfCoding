package BINARY_TREE;

class ConstTreeFromInPre {
    Node root;
    static int index = 0;

    static class Node {
        char data;
        Node left;
        Node right;

        Node(char d) {
            data = d;
            left = null;
            right = null;
        }
    }

    public int search(char arr[], int start, int end, char value) {
        int i;
        for (i = start; i <= end; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return i;
    }
     Node tree(char in[],char pre[],int start,int end){
        if(start>end){
            return null;
        }
        Node tNode=new Node(pre[index++]);
        if(start==end){
            return tNode;
        }
        int inindex=search(in, start, end, tNode.data);

        tNode.left=tree(in, pre, start, inindex-1);
        tNode.right=tree(in, pre, inindex+1, end);
        return tNode;
     }
     public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
     }
     public static void main(String[] ef){
        ConstTreeFromInPre tree=new ConstTreeFromInPre();
        char in[]={'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[]={'A', 'B', 'D', 'E', 'C', 'F'};
        int n=in.length-1;
        Node root=tree.tree(in, pre, 0, n);

        tree.inorder(root);
     }
}

