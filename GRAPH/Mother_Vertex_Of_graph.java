package GRAPH;

import java.util.ArrayList;

public class Mother_Vertex_Of_graph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    static void DFSUtil(ArrayList<ArrayList<Integer>> g, int n, boolean[] visited) {
        visited[n] = true;
        for (int x : g.get(n)) {
            if (!visited[x]) {
                DFSUtil(g, x, visited);
            }
        }
    }

    static int motherVertex(ArrayList<ArrayList<Integer>> g, int n) {
        boolean[] check = new boolean[n];
        int mother = -1;
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                DFSUtil(g, i, check);
                mother = i;
            }
        }
        boolean[] visit = new boolean[n];
        DFSUtil(g, mother, visit);
        for (boolean val : visit) {
            if (!val) {
                return -1;
            }
        }
        return mother;
    }

    public static void main(String[] jg) {
        int v = 7;
        int e = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 4, 1);
        addEdge(adj, 6, 4);
        // addEdge(adj, 5, 6);
        addEdge(adj, 5, 2);
        addEdge(adj, 6, 0);
        System.out.println(motherVertex(adj, v));
    }
}
