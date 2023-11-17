package GRAPH;

public class Floyd_Warshall_Algo {
    static int INF = 99999;

    void floydwarshall(int dist[][], int v) {
        int i, j, k;
        for (k = 0; k < v; k++) {
            for (i = 0; i < v; i++) {
                for (j = 0; j < v; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        printpath(dist, v);
    }

    void printpath(int dist[][], int v) {
        System.out.println("The following matrix shown the shortest path between every pair of matrix");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] jeb) {
        int graph[][] = { { 0, 5, INF, 10 },
                { INF, 0, 3, INF },
                { INF, INF, 0, 1 },
                { INF, INF, INF, 0 } };
        Floyd_Warshall_Algo path = new Floyd_Warshall_Algo();
        path.floydwarshall(graph, graph.length);
    }
}
