package BST;

public class Deletion_BST {
    Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    // void delete(int key){
    //     root=deleteKey(root, key);
    // }
    Node deleteKey(Node root,int key){
        if(root==null){
            return root;
        }
        if(root.data>key){
            root.left=deleteKey(root.left, key);
        }
        else if(root.data<key){
            root.right=deleteKey(root.right, key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.data=minvalue(root.right);
            // root=new Node(minvalue(root.right));
            root.right=deleteKey(root.right, root.data);
        }
        return root;
    }

    int minvalue(Node root){
        int minv=root.data;
        while(root.left!=null){
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }
    Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key>root.data){
            root.right=insert(root.right, key);
        }
        else if(key<root.data){
            root.left=insert(root.left, key);
        }
        return root;
    }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] jdb){
        Deletion_BST bst=new Deletion_BST();
        bst.root=new Node(50);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 55);
        bst.insert(bst.root, 80);

        bst.inorder(bst.root);

        bst.deleteKey(bst.root, 50);
        // bst.delete(50);
        System.out.println();
        bst.inorder(bst.root);

    //     bst.deleteKey(bst.root, 70);
    //     System.out.println();
    //     bst.inorder(bst.root);
    }

}
