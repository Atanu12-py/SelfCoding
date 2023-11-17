// **********BFS of disconnected graph using adjacency list(Hashmap)********
// ******************************************************************

package GRAPH;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_For_Undirected {
    static HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();

    static void addEdge(int u, int v) {
        if (graph.containsKey(u)) {
            LinkedList<Integer> l = graph.get(u);
            l.add(v);
            graph.put(u, l);
        } else {
            LinkedList<Integer> l = new LinkedList<>();
            l.add(v);
            graph.put(u, l);
        }
    }

    static void bfshelp(int s, boolean[] visited) {
        Queue<Integer> qq = new LinkedList<>();
        qq.add(s);
        visited[s] = true;
        while (!qq.isEmpty()) {
            int n = qq.poll();
            System.out.print(n + " ");
            if (graph.containsKey(n)) {
                Iterator<Integer> i = graph.get(n).iterator();
                while (i.hasNext()) {
                    int k = i.next();
                    if (!visited[k]) {
                        qq.add(k);
                        visited[k] = true;
                    }
                }
            }
        }
    }

    static void bfs(int v) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                bfshelp(i, visited);
            }
        }
    }

    public static void main(String[] jebf) {
        int v = 5;
        addEdge(0, 4);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 3);
        addEdge(3, 4);

        bfs(v);
    }
}

// **********BFS of disconnected graph using adjacency matrix********
// ******************************************************************

// public class BFS_For_Undirected {
// int v;
// int edges[][];

// BFS_For_Undirected(int val) {
// v = val;
// edges = new int[v][v];
// }

// void addEdge(int u, int v) {
// edges[u][v] = 1;
// }

// void bfsHelper(int start, boolean[] visited) {
// Queue<Integer> qq = new LinkedList<>();
// qq.add(start);
// visited[start] = true;
// while (!qq.isEmpty()) {
// int n = qq.poll();
// System.out.print(n + " ");
// for (int i = 0; i < v; i++) {
// if (edges[n][i] == 1) {
// if (!visited[i]) {
// qq.add(i);
// visited[i] = true;
// }
// }
// }
// }

// }

// void bfs() {
// if (v == 0) {
// return;
// }
// boolean[] visited = new boolean[v];
// for (int i = 0; i < v; i++) {
// if (!visited[i]) {
// bfsHelper(i, visited);
// }
// }
// }

// public static void main(String[] jebd) {
// BFS_For_Undirected bfs = new BFS_For_Undirected(5);
// bfs.addEdge(0, 4);
// bfs.addEdge(1, 2);
// bfs.addEdge(1, 3);
// bfs.addEdge(1, 4);
// bfs.addEdge(2, 3);
// bfs.addEdge(3, 4);

// // boolean[] vi=new boolean[5];

// bfs.bfs();
// // bfs.bfsHelper(0, vi);
// }
// }
