package GRAPH;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Path_OnePrime_To_Other {
    int v;
    LinkedList<Integer> adj[];

    Shortest_Path_OnePrime_To_Other(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    static void SieveOfEratosthenes(LinkedList<Integer> lst) {
        int n = 9999;
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        for (int i = 1000; i <= n; i++) {
            if (prime[i]) {
                lst.add(i);
            }
        }
    }

    int bfs(int in1, int in2) {
        int visisted[] = new int[v];
        Arrays.fill(visisted, 0);
        Queue<Integer> qq = new LinkedList<Integer>();

        visisted[in1] = 1;
        qq.add(in1);

        while (!qq.isEmpty()) {
            int p = qq.poll();
            for (int i : adj[p]) {

                if (visisted[i] == 0) {
                    visisted[i] = visisted[p] + 1;
                    qq.add(i);
                }
                if (i == in2) {
                    return visisted[i] - 1;
                }
            }
        }
        return 0;
    }

    static boolean comapre(int num1, int num2) {
        char[] s1 = (Integer.toString(num1)).toCharArray();
        char[] s2 = (Integer.toString(num2)).toCharArray();

        int c = 0;

        if (s1[0] != s2[0]) {
            c++;
        }
        if (s1[1] != s2[1]) {
            c++;
        }
        if (s1[2] != s2[2]) {
            c++;
        }
        if (s1[3] != s2[3]) {
            c++;
        }
        return c == 1;
    }

    static int shortestPath(int num1, int num2) {
        LinkedList<Integer> pset = new LinkedList<Integer>();

        SieveOfEratosthenes(pset);

        Shortest_Path_OnePrime_To_Other g = new Shortest_Path_OnePrime_To_Other(pset.size());

        for (int i = 0; i < pset.size(); i++) {
            for (int j = i + 1; j < pset.size(); j++) {
                if (comapre(pset.get(i), pset.get(j))) {
                    g.addEdge(i, j);
                }
            }
        }
        int in1 = 0, in2 = 0;
        for (int i = 0; i < pset.size(); i++) {
            if (pset.get(i) == num1) {
                in1 = i;
            }
            if (pset.get(i) == num2) {
                in2 = i;
            }
        }
        return g.bfs(in1, in2);
    }

    public static void main(String[] jwbf) {
        int num1 = 1033, num2 = 8179;
        int ans = shortestPath(num1, num2);
        System.out.println(ans);
    }
}
