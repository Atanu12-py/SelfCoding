/////Count all possibe walk from source to destination by exactly k edges...........***********///
package GRAPH;

public class Count_All_Pos_Walk {
    static int V = 4;

    static int countpossiblewalk(int graph[][], int u, int v, int k) {
        if (k == 0 && u == v) {
            return 1;
        }
        if (k == 1 && graph[u][v] == 1) {
            return 1;
        }
        if (k <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (graph[u][i] == 1) {
                count += countpossiblewalk(graph, i, v, k - 1);
            }
        }
        return count;
    }

    public static void main(String[] kfb) {
        int graph[][] = new int[][] { { 0, 1, 1, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 0 } };
        int u = 0, v = 3, k = 2;
        System.out.println(countpossiblewalk(graph, u, v, k));

    }
}
