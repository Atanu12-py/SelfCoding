package GRAPH;

public class Dijkstra_Algo {
    static int v = 9;

    static int mindistance(int dist[], boolean sptset[]) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for (int i = 0; i < v; i++) {
            if (sptset[i] == false && dist[i] <= min) {
                min = dist[i];
                min_index = i;
            }
        }
        return min_index;
    }

    static void printsolution(int dist[]) {
        System.out.println("Vertex \t\t Distance from source");
        for (int i = 0; i < v; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    static void dijkstra(int graph[][], int scr) {
        int dist[] = new int[v];
        boolean sptset[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptset[i] = false;
        }
        dist[scr] = 0;
        for (int count = 0; count < v; count++) {
            int u = mindistance(dist, sptset);
            sptset[u] = true;
            for (int i = 0; i < v; i++) {
                if (!sptset[i] && graph[u][i] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][i] < dist[i]) {
                    dist[i] = dist[u] + graph[u][i];
                }
            }
        }
        printsolution(dist);
    }

    public static void main(String[] jeb) {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        dijkstra(graph, 0);
    }
}
