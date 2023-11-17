package GRAPH;

import java.util.*;

public class Prims_Min_Spanning {
    static int V = 5;

    static int minkey(int key[], boolean mstset[]) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for (int i = 0; i < V; i++) {
            if (mstset[i] == false && key[i] < min) {
                min = key[i];
                min_index = i;
            }
        }
        return min_index;
    }

    static void prims_Algo(int graph[][]) {
        int parent[] = new int[V];

        int key[] = new int[V];

        boolean mstset[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            mstset[i] = false;
            key[i] = Integer.MAX_VALUE;
        }

        key[0] = 0;
        parent[0] = -1;
        for (int v = 0; v < V; v++) {
            int u = minkey(key, mstset);
            mstset[u] = true;

            for (int i = 0; i < V; i++) {
                if (graph[u][i] != 0 && mstset[i] == false && graph[u][i] < key[i]) {
                    key[i] = graph[u][i];
                    parent[i] = u;
                }
            }
        }
        printmst(parent, graph);

    }

    static void printmst(int parent[], int graph[][]) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + "-" + i + "\t" + graph[parent[i]][i]);
        }
    }

    public static void main(String[] rjf) {
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        prims_Algo(graph);

    }
}
