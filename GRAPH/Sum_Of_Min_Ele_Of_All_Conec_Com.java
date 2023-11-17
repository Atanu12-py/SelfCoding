package GRAPH;

import java.util.LinkedList;

public class Sum_Of_Min_Ele_Of_All_Conec_Com {
    int v;
    LinkedList<Integer> adj[];
    boolean visited[] = new boolean[1000];

    Sum_Of_Min_Ele_Of_All_Conec_Com(int val) {
        v = val;
        adj=new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int u, int v) {
        adj[u - 1].add(v - 1);
        adj[v - 1].add(u - 1);
    }

    void dfs(int i, int a[], int mini) {
        mini = Math.min(mini, a[i]);
        visited[i] = true;
        for (int j : adj[i]) {
            if (!visited[j]) {
                dfs(j, a, mini);
            }
        }

    }

    int sum(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int mini = a[i];
                dfs(i, a, mini);
                sum += mini;
            }
        }
        return sum;
    }
    // void addEdge(int u,int v,int[] a){
    //     adj[a[u]].add(a[v]);
    //     adj[a[v]].add(a[u]);
    // }

    // int sum2(int a[],int n){
    //     int sum2=0;
    //     for(int i:a){

    //     }
    // }
    public static void main(String[] wkbd){
        // int a[]={1,6,2,7,3,8,4,9,5,10};
        int a[]={2,5,3,8,4};
        Sum_Of_Min_Ele_Of_All_Conec_Com sum=new Sum_Of_Min_Ele_Of_All_Conec_Com(a.length);
        // sum.addEdge(1, 2);
        // sum.addEdge(3, 4);
        // sum.addEdge(5, 6);
        // sum.addEdge(7, 8);
        // sum.addEdge(9, 10);
        sum.addEdge(1, 4);
        sum.addEdge(4, 5);

        System.out.println(sum.sum(a, a.length));
    }
}
