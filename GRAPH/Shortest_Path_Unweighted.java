package GRAPH;

import java.util.*;

public class Shortest_Path_Unweighted {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static boolean BFS(ArrayList<ArrayList<Integer>> adj, int scr, int dest, int v, int pred[], int dist[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        dist[scr] = 0;
        visited[scr] = true;
        queue.add(scr);
        while (!queue.isEmpty()) {
            int count = queue.remove();
            for (int i = 0; i < adj.get(count).size(); i++) {
                if (visited[adj.get(count).get(i)] == false) {
                    visited[adj.get(count).get(i)] = true;
                    dist[adj.get(count).get(i)] = dist[count] + 1;
                    pred[adj.get(count).get(i)] = count;
                    queue.add(adj.get(count).get(i));
                    if (adj.get(count).get(i) == dest) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static void shortestpath(ArrayList<ArrayList<Integer>> adj, int scr, int dest, int v) {
        int pred[] = new int[v];
        int dist[] = new int[v];

        if (BFS(adj, scr, dest, v, pred, dist) == false) {
            System.out.println("There is no path to reach from " + scr + " to " + dest);
            return;
        }
        LinkedList<Integer> path = new LinkedList<Integer>();
        int predecessor = dest;
        path.add(predecessor);
        while (pred[predecessor] != -1) {
            path.add(pred[predecessor]);
            predecessor = pred[predecessor];
        }
        System.out.println("Shortest path length is " + dist[dest]);
        System.out.println("The path is");
        for (int i = path.size() - 1; i >= 0; i--) {
            System.out.print(path.get(i)+" ");
        }
    }

    public static void main(String[] jebf) {
        int v = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 3, 7);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 4, 7);
        addEdge(adj, 5, 6);
        addEdge(adj, 6, 7);

        int scr = 2, dest = 6;
        shortestpath(adj, scr, dest, v);
    }
}
