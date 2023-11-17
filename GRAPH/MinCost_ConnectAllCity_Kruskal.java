package GRAPH;

import java.util.*;

public class MinCost_ConnectAllCity_Kruskal {
    static void makeset(int parent[], int rank[], int n) {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    static int findparent(int parent[], int node) {
        if (parent[node] == node) {
            return node;
        }
        return parent[node] = findparent(parent, parent[node]);
    }

    static void unionset(int u, int v, int parent[], int rank[]) {
        u = findparent(parent, u);
        v = findparent(parent, v);
        if (rank[u] < rank[v]) {
            parent[u] = v;
        } else if (rank[u] > rank[v]) {
            parent[v] = u;
        } else {
            parent[v] = u;
            rank[u]++;
        }
    }

    static int mincost(int n, int city[][]) {
        int parent[] = new int[n];
        int rank[] = new int[n];
        makeset(parent, rank, n);
        Arrays.sort(city, Comparator.comparingInt(o -> o[2]));
        int cost = 0;
        for (int i = 0; i < n; i++) {
            int u = findparent(parent, city[i][0]);
            int v = findparent(parent, city[i][1]);
            int wt = city[i][2];
            if (u != v) {
                cost += wt;
                unionset(u, v, parent, rank);
            }
        }
        return cost;
    }

    public static void main(String[] eb) {
        int city[][] = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 0, 3, 3 }, { 0, 4, 4 }, { 1, 4, 7 }, { 2, 3, 6 } };
        int n1 = city.length;
        System.out.println(mincost(n1, city));

        int city2[][] = { { 0, 1, 1 }, { 0, 2, 1 }, { 1, 2, 1 }, { 0, 3, 100 }, { 3, 4, 2 }, { 3, 5, 2 }, { 5, 4, 2 } };
        int n2 = city2.length;
        System.out.println(mincost(n2, city2));

    }
}
