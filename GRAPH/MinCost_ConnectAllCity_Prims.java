package GRAPH;

public class MinCost_ConnectAllCity_Prims {
    static int minnode(int n, int key[], boolean[] mstset) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for (int i = 0; i < n; i++) {
            if (mstset[i] == false && key[i] < min) {
                min = key[i];
                min_index = i;
            }
        }
        return min_index;
    }

    static void mincost(int n, int city[][]) {
        int parent[] = new int[n];
        int key[] = new int[n];
        boolean[] mstset = new boolean[n];
        for (int i = 0; i < n; i++) {
            mstset[i] = false;
            key[i] = Integer.MAX_VALUE;
        }

        key[0] = 0;
        parent[0] = -1;
        for (int i = 0; i < n; i++) {
            int u = minnode(n, key, mstset);
            mstset[u] = true;
            for (int v = 0; v < n; v++) {
                if (city[u][v] > 0 && mstset[v] == false && city[u][v] < key[v]) {
                    key[v] = city[u][v];
                    parent[v] = u;
                }
            }
        }
        int cost = 0;
        for (int i = 1; i < n; i++) {
            cost += city[parent[i]][i];
        }
        System.out.println(cost);
    }

    public static void main(String[] ejb) {
        int city1[][] = new int[][] { { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };

        int n1 = city1.length;
        mincost(n1, city1);

        int city2[][] = { { 0, 1, 1, 100, 0, 0 },
                { 1, 0, 1, 0, 0, 0 },
                { 1, 1, 0, 0, 0, 0 },
                { 100, 0, 0, 0, 2, 2 },
                { 0, 0, 0, 2, 0, 2 },
                { 0, 0, 0, 2, 2, 0 } };

        int n2 = city2.length;
        mincost(n2, city2);
    }
}
