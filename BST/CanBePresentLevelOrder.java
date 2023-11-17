package BST;

import java.util.LinkedList;
import java.util.Queue;

public class CanBePresentLevelOrder {
    static class NodeDetails{
        int data;
        int min,max;
    }
    static boolean islevelOrder(int arr[],int n){
        if(n==0){
            return true;
        }
        Queue<NodeDetails> q=new LinkedList<NodeDetails>();

        int i=0;
        NodeDetails newnode=new NodeDetails();
        newnode.data=arr[i++];
        newnode.min=Integer.MIN_VALUE;
        newnode.max=Integer.MAX_VALUE;
        q.add(newnode);

        while(i!=n && !q.isEmpty()){
            NodeDetails temp=q.peek();
            q.remove();
            newnode=new NodeDetails();
            if(i<n && (arr[i]<(int)temp.data && arr[i]>(int)temp.min)){
                newnode.data=arr[i++];
                newnode.min=temp.min;
                newnode.max=temp.data;
                q.add(newnode);
            }
            newnode=new NodeDetails();
            if(i<n && (arr[i]>(int)temp.data && arr[i]<(int)(temp.max) )){
                newnode.data=arr[i++];
                newnode.min=temp.data;
                newnode.max=temp.max;
                q.add(newnode);
            }
        }
        if(i==n){
            return true;
        }
        return false;
    }
    public static void main(String args[])
{
    int arr[] = {7, 4, 12, 3, 6, 8, 1, 5, 10};
    int n = arr.length;
    if (islevelOrder(arr, n))
        System.out.print( "Yes");
    else
        System.out.print( "No");    
     
}
}
