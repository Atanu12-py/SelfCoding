package GRAPH;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Topological_Sort {
    static int v;
    LinkedList<Integer> adj[];

    Topological_Sort(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    void DFS(int i, boolean visited[], Stack<Integer> st) {
        visited[i] = true;
        Iterator<Integer> j = adj[i].iterator();
        while (j.hasNext()) {
            int k = j.next();
            if (!visited[k]) {
                DFS(k, visited, st);
            }

        }
        st.push(i);
    }
    void toposort(){
        boolean visited[]=new boolean[v];
        Stack<Integer> st=new Stack<Integer>();
    
        for(int i=0;i<v;i++){
            if(!visited[i]){
                DFS(i, visited, st);
            }
        }
        // System.out.println(st.size());
        for(int i=0;i<v;i++){
            System.out.print(st.pop()+" ");
        }
    }
    public static void main(String[] jebf){
        Topological_Sort sort=new Topological_Sort(4);
        sort.addEdge(0, 1);
        sort.addEdge(0, 3);
        sort.addEdge(1, 2);
        sort.addEdge(3, 2);
        // sort.addEdge(2, 3);
        // sort.addEdge(3, 1);

        sort.toposort();
    }
}
