package GRAPH;

import java.util.Arrays;
import java.util.Comparator;

public class Kruskal_Algo {
    void makeset(int parent[], int rank[], int n) {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int findparent(int parent[], int node) {
        if (parent[node] == node) {
            return node;
        }
        return parent[node] = findparent(parent, parent[node]);
    }

    void unionset(int u, int v, int parent[], int rank[]) {
        u = findparent(parent, u);
        v = findparent(parent, v);
        if (rank[u] < rank[v]) {
            parent[u] = v;
        } else if (rank[v] < rank[u]) {
            parent[v] = u;
        } else {
            parent[v] = u;
            rank[u]++;
        }
    }

    int kruskalmst(int graph[][], int n) {
        int parent[] = new int[n];
        int rank[] = new int[n];
        makeset(parent, rank, n);
        Arrays.sort(graph, Comparator.comparingInt(o -> o[2]));
        int minweight = 0;
        for (int i = 0; i < n; i++) {
            int u = findparent(parent, graph[i][0]);
            int v = findparent(parent, graph[i][1]);
            int wt = graph[i][2];
            if (u != v) {
                System.out.println(graph[i][0] + "-" + graph[i][1] + "->" + wt);
                minweight += wt;
                unionset(u, v, parent, rank);
            }
        }
        return minweight;
    }

    public static void main(String[] jwb) {
        // int graph[][] = new int[][] { { 1, 2, 6 }, { 2, 3, 2 }, { 1, 3, 2 }, { 1, 0,
        // 2 } };
        // int graph[][]=new
        // int[][]{{0,1,4},{0,7,8},{1,2,8},{1,7,11},{7,6,1},{7,8,7},{2,8,2},{8,6,6},{6,5,2},{2,3,7},{2,5,4},{3,5,14},{3,4,9},{4,5,10}};
        int graph[][] = new int[][] { { 0, 1, 10 }, { 0, 2, 6 }, { 0, 3, 5 }, { 1, 3, 15 }, { 2, 3, 4 } };
        Kruskal_Algo krus = new Kruskal_Algo();
        int wt = krus.kruskalmst(graph, graph.length);
        System.out.println(wt);
    }
}
