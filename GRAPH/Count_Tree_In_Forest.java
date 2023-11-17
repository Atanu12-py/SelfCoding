package GRAPH;

import java.util.Iterator;
import java.util.LinkedList;

public class Count_Tree_In_Forest {
    int v;
    LinkedList<Integer> adj[];

    Count_Tree_In_Forest(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    void addEdge(int v,int u){
        adj[v].add(u);
    }

    void DFS(int n, boolean[] visited) {
        visited[n] = true;
        Iterator<Integer> i = adj[n].iterator();
        while (i.hasNext()) {
            int k = i.next();
            if (visited[k] == false) {
                DFS(k, visited);
            }
        }
    }
    int TreeCount(){
        boolean[] visited=new boolean[v];
        int res=0;
        for(int i=0;i<v;i++){
            if(!visited[i]){
                DFS(i, visited);
                res++;
            }
            
        }
        return res;
    }
    public static void main(String[] jwb){
        Count_Tree_In_Forest tree=new Count_Tree_In_Forest(4);
        tree.addEdge(0, 1);
        tree.addEdge(0, 2);
        tree.addEdge(0, 3);
        tree.addEdge(1, 3);
        tree.addEdge(3, 2);
 
        System.out.println(tree.TreeCount());
    }
}
