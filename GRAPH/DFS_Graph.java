package GRAPH;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DFS_Graph {
    private int v;
    private LinkedList<Integer> adj[];
    // private Array<LinkedList<Integer>> adj;

    DFS_Graph(int V) {
        v = V;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
            // adj.add(new LinkedList<Integer>());
        }

    }

    void addEdge(int v, int e) {
        adj[v].add(e);
    }

    void DFS(int s, boolean visited[]) {
        visited[s] = true;
        System.out.print(s + " ");

        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFS(n, visited);
            }
        }
    }
    void util(){
        boolean arr[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!arr[i]){
                DFS(i, arr);
            }
        }
    }

    public static void main(String[] ejb) {
        DFS_Graph dfs = new DFS_Graph(4);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);
        dfs.addEdge(2, 0);
        dfs.addEdge(3, 3);

        boolean arr[] = new boolean[4];
        dfs.DFS(1, arr);
        // dfs.util();
    }
}
