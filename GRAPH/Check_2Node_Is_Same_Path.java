package GRAPH;

import java.util.Vector;

public class Check_2Node_Is_Same_Path {
    static int max = 10001;
    static boolean visit[] = new boolean[max];
    static int intime[] = new int[max];
    static int outtime[] = new int[max];
    static int timer = 0;

    static void dfs(Vector<Integer> graph[], int v) {
        visit[v] = true;
        timer++;
        intime[v] = timer;

        for (int i : graph[v]) {
            if (!visit[i]) {
                dfs(graph, i);
            }
        }
        timer++;
        outtime[v] = timer;
    }

    static boolean queury(int u, int v) {
        return intime[u] < intime[v] && outtime[u] > outtime[v] || intime[v] < intime[u] && outtime[v] > outtime[u];
    }

    public static void main(String[] jrf) {
        int n = 9;
        Vector<Integer> graph[] = new Vector[n + 1];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new Vector<Integer>();
        }
        graph[1].add(2);
        graph[1].add(3);
        graph[3].add(6);
        graph[2].add(4);
        graph[2].add(5);
        graph[5].add(7);
        graph[5].add(8);
        graph[5].add(9);

        dfs(graph, 1);

        if (queury(1, 5)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        if (queury(2, 9)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (queury(2, 6)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
