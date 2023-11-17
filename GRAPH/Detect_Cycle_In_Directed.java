package GRAPH;

import java.util.*;

public class Detect_Cycle_In_Directed {
    int v;
    LinkedList<Integer> adj[];

    Detect_Cycle_In_Directed(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public boolean iscycle(int i, boolean[] visited, boolean recstack[]) {
        if (recstack[i]) {
            return true;
        }
        if (visited[i]) {
            return false;
        }
        visited[i] = true;
        recstack[i] = true;
        for (int n : adj[i]) {
            if (iscycle(n, visited, recstack)) {
                return true;
            }
        }
        recstack[i] = false;
        return false;
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    boolean cycle() {
        boolean[] visited = new boolean[v];
        boolean[] recstack = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (iscycle(i, visited, recstack)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] he) {
        Detect_Cycle_In_Directed cycle = new Detect_Cycle_In_Directed(4);
        cycle.addEdge(0, 1);
        cycle.addEdge(0, 2);
        cycle.addEdge(1, 2);
        cycle.addEdge(2, 0);
        cycle.addEdge(2, 3);
        cycle.addEdge(3, 3);

        if(cycle.cycle()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
