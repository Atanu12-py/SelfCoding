package GRAPH;

import java.util.Vector;

public class Number_Of_Pair_Not_Accessible {
    static int k;

    static void dfs(Vector<Integer> graph[], boolean[] visited, int x) {
        for (int i = 0; i < graph[x].size(); i++) {
            if (!visited[graph[x].get(i)]) {
                k++;
                visited[graph[x].get(i)] = true;
                dfs(graph, visited, graph[x].get(i));
            }
        }
    }

    static int countnotaccessible(Vector<Integer> graph[], int N) {
        boolean[] visited = new boolean[N * N + N];
        int res = 0;
        for (int i = 1; i <= N * N; i++) {
            k = 0;
            if (!visited[i]) {
                visited[i] = true;
                k++;
                dfs(graph, visited, i);
                res += k * (N * N - k);
            }
        }
        return res;
    }

    static void insertpath(Vector<Integer> graph[], int N, int x1, int y1, int x2, int y2) {
        int a = (x1 - 1) * N + y1;
        int b = (x2 - 1) * N + y2;
        graph[a].add(b);
        graph[b].add(a);
    }

    public static void main(String[] jdb) {
        int N = 2;
        Vector<Integer> graph[] = new Vector[N * N + 1];
        for (int i = 1; i <= N * N; i++) {
            graph[i] = new Vector<Integer>();
        }
        insertpath(graph, N, 1, 1, 1, 2);
        insertpath(graph, N, 1, 2, 2, 2);

        System.out.println(countnotaccessible(graph, N));
    }
}
