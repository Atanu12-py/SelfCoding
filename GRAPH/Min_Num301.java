package GRAPH;

import java.util.ArrayList;
import java.util.HashSet;

class Min_Num30 {
    ArrayList<Integer> adj[];

    public Min_Num30(int v) {
        adj = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public int dfs(int s, int d, HashSet<Integer> visited) {
        if (s == d) {
            return 0;
        }
        int res = Integer.MAX_VALUE - 1;
        visited.add(s);
        for (int item : adj[s]) {
            if (!visited.contains(item)) {
                res = Math.min(res, 1 + dfs(item, d, visited));
            }
        }
        return res;
    }
}

public class Min_Num301 {
    static int N = 4;

    static boolean IsSafe(int arr[][], int i, int j) {
        if ((i < 0 || i >= N) || (j < 0 || j >= N) || arr[i][j] == 0) {
            return false;
        }
        return true;
    }

    static int min_moves(int arr[][]) {
        int s = -1;
        int d = -1;
        int v = N * N;
        int k = 0;
        Min_Num30 graph = new Min_Num30(v);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] != 0) {
                    if (IsSafe(arr, i, j + 1)) {
                        graph.addEdge(k, k + 1);
                    }
                    if (IsSafe(arr, i, j - 1)) {
                        graph.addEdge(k, k - 1);
                    }
                    if (IsSafe(arr, i + 1, j)) {
                        graph.addEdge(k, k + N);
                    }
                    if (IsSafe(arr, i - 1, j)) {
                        graph.addEdge(k, k - N);
                    }
                }
                if (arr[i][j] == 1) {
                    s = k;
                } else if (arr[i][j] == 2) {
                    d = k;
                }
                k++;
            }
        }
        HashSet<Integer> visited = new HashSet<Integer>();
        return graph.dfs(s, d, visited);

    }

    public static void main(String[] jwbd) {
        int[][] arr = { { 3, 3, 1, 0 },
                { 3, 0, 3, 3 },
                { 2, 3, 0, 3 },
                { 0, 3, 3, 3 } };
        int ans = min_moves(arr);
        System.out.println(ans);
    }
}
