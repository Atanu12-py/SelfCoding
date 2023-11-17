package GRAPH;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFS_Iterative {
    int v;
    LinkedList<Integer> adj[];

    DFS_Iterative(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    void DFS(int k) {
        boolean visited[] = new boolean[v];
        Stack<Integer> st = new Stack<>();

        st.push(k);
        while (!st.empty()) {
            int s = st.peek();
            st.pop();
            if (visited[s] == false) {
                System.out.print(s + " ");
                visited[s] = true;
            }
            Iterator<Integer> itr = adj[s].iterator();
            while (itr.hasNext()) {
                int i = itr.next();
                if (visited[i] == false) {
                    st.push(i);
                }
            }
        }
    }

    public static void main(String[] ddh) {
        DFS_Iterative dfs=new DFS_Iterative(5);
        // dfs.addEdge(1, 4);
        dfs.addEdge(3, 4);
        dfs.addEdge(1, 0);
        dfs.addEdge(4, 0);
        // dfs.addEdge(0, 2);
        dfs.addEdge(2, 1);
        // dfs.addEdge(0, 3);

        dfs.DFS(1);
    }
}
