package BINARY_TREE;

public class PostOrderFromPreOrder {
    static class INT {
        int data;

        INT(int d) {
            data = d;
        }
    }

    public void postorderTraversal(int pre[], int n, int min_val, int max_val, INT preindex) {
        if (preindex.data == n) {
            return;
        }
        if (pre[preindex.data] < min_val || pre[preindex.data] > max_val) {
            return;
        }

        int val = pre[preindex.data];
        preindex.data++;

        postorderTraversal(pre, n, min_val, val, preindex);

        postorderTraversal(pre, n, val, max_val, preindex);

        System.out.print(val + " ");
    }

    void findpostorder(int pree[], int n) {
        INT preindex = new INT(0);
        postorderTraversal(pree, n, Integer.MIN_VALUE, Integer.MAX_VALUE, preindex);
    }

    public static void main(String[] j) {
        int pre[] = { 40, 30, 35, 80, 100 };
        int n = pre.length;
        PostOrderFromPreOrder post = new PostOrderFromPreOrder();
        post.findpostorder(pre, n);
    }
}
