package GRAPH;

import java.util.Iterator;
import java.util.LinkedList;

public class Detect_Cycle_In_Undirected {
    int v;
    LinkedList<Integer> adj[];

    Detect_Cycle_In_Undirected(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }

    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    boolean iscycle(int i, boolean visited[], int parent) {
        visited[i] = true;
        Iterator<Integer> it = adj[i].iterator();
        while (it.hasNext()) {
            int v = it.next();
            if (!visited[v]) {
                if (iscycle(v, visited, i)) {
                    return true;
                }
            } else if (v != parent) {
                return true;
            }
        }
        return false;
    }

    boolean cycle() {
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (iscycle(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] jdb) {
        Detect_Cycle_In_Undirected graph = new Detect_Cycle_In_Undirected(5);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);

        if (graph.cycle()) {
            System.out.println("Has cycle");
        } else {
            System.out.println("No cycle");
        }

    }

}
