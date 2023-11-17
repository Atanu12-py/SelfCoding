package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNode {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    public void deleteDepest(Node root, Node delNode) {
        Queue<Node> qq = new LinkedList<Node>();
        qq.add(root);
        Node temp = null;
        while (!qq.isEmpty()) {
            temp = qq.peek();
            qq.remove();
            if (temp == delNode) {
                temp = null;
                return;
            }
            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    qq.add(temp.left);
                }
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    qq.add(temp.right);
                }
            }
        }
    }

    public void delete(Node root, int del) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.data == del) {
                root = null;
                return;
            } else {
                return;
            }
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node keyN = null;
        Node temp = null;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.data == del) {
                keyN = temp;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }

        }
        if (keyN != null) {
            int x = temp.data;
            deleteDepest(root, temp);
            keyN.data = x;
        }
    }

    public void deleteNode(Node root, int key) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.data == key) {
                root = null;
                return;
            } else {
                return;
            }
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null, keyN = null, last = null;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.data == key) {
                keyN = temp;
            }
            if (temp.left != null) {
                last = temp;
                q.add(temp.left);
            }
            if (temp.right != null) {
                last = temp;
                q.add(temp.right);
            }
        }
        if (keyN != null) {
            int x = temp.data;
            keyN.data = x;
            if (last.right == temp) {
                last.right = null;
            } else {
                last.left = null;
            }
        }
    }

    public int min(Node root) {
        int x = root.data;
        if (root.left == null && root.right == null) {
            x = root.data;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left != null) {
                if (temp.left.data < x) {
                    x = temp.left.data;
                }
            }
            if (temp.right != null) {
                if (temp.right.data < x) {
                    x = temp.right.data;
                }
            }
        }
        return x;
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static void main(String[] ejgd) {
        DeleteNode del = new DeleteNode();
        del.root = new Node(10);
        del.root.left = new Node(20);
        del.root.right = new Node(30);
        del.root.left.left = new Node(40);
        del.root.left.right = new Node(50);
        del.root.right.left = new Node(60);
        del.root.right.right = new Node(70);
        del.root.left.left.left = new Node(80);
        del.root.left.left.right = new Node(8);

        del.inorder(del.root);
        del.delete(del.root, 20);
        // del.deleteNode(del.root, 20);
        System.out.println();
        del.inorder(del.root);
        System.out.println();
        // System.out.println(del.min(del.root));
    }

}
