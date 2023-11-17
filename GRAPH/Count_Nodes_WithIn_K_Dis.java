package GRAPH;

import java.util.*;

public class Count_Nodes_WithIn_K_Dis {
    static int v;
    static LinkedList<Integer> adj[];

    Count_Nodes_WithIn_K_Dis(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }

    }

    static void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    static int nodesKDistanceFromMarked(int marked[], int N, int K) {
        // LinkedList<Integer> levelset[] = new LinkedList[N];
        int[][] levelset = new int[N][v];
        for (int i = 0; i < N; i++) {
            levelset[i] = new int[v];
        }
        for (int i = 0; i < marked.length; i++) {
            BFS(levelset[i], marked[i]);
        }
        int count = 0;
        for (int i = 0; i < v; i++) {
            int countutil = 0;
            for (int j = 0; j < N; j++) {
                if (levelset[j][i] <= K) {
                    countutil++;
                }
            }
            if (countutil == N) {
                count++;
            }
        }
        return count;
    }

    static void BFS(int[] level, int s) {
        boolean[] visited = new boolean[v];
        level[s] = 0;
        visited[s] = true;

        Queue<Integer> qq = new LinkedList<Integer>();
        qq.add(s);
        while (!qq.isEmpty()) {
            int n = qq.poll();
            Iterator<Integer> i = adj[n].iterator();
            while (i.hasNext()) {
                int l = i.next();
                if (!visited[l]) {
                    visited[l] = true;
                    level[l] = level[n] + 1;
                    qq.add(l);
                }
            }
        }

    }

    public static void main(String[] jegd) {
        Count_Nodes_WithIn_K_Dis count = new Count_Nodes_WithIn_K_Dis(11);
        addEdge(1, 10);
        addEdge(0, 1);
        addEdge(0, 3);
        addEdge(0, 8);
        addEdge(3, 2);
        addEdge(3, 6);
        addEdge(3, 7);
        addEdge(3, 5);
        // addEdge(3, 10);
        addEdge(4, 5);
        addEdge(4, 9);

        int marked[] = { 1, 2, 4, 10 };
        int N = marked.length;
        int K = 3;
        System.out.println(nodesKDistanceFromMarked(marked, N, K));
    }
}
