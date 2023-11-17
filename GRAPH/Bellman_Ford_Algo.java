package GRAPH;

public class Bellman_Ford_Algo {
    class Edge {
        int scr, dest, weight;

        Edge() {
            scr = dest = weight = 0;
        }

    }

    int V;
    int E;
    Edge edge[];

    Bellman_Ford_Algo(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }

    void BellmanFord(Bellman_Ford_Algo graph, int scr) {
        int V = graph.V;
        int E = graph.E;
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[scr] = 0;
        for (int i = 1; i < V; i++) {
            for (int j = 0; j < E; j++) {
                int u = graph.edge[j].scr;
                int v = graph.edge[j].dest;
                int weight = graph.edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }

            }
        }
        for (int i = 0; i < E; i++) {
            int u = graph.edge[i].scr;
            int v = graph.edge[i].dest;
            int weight = graph.edge[i].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }
        printweight(dist, V);
    }

    void printweight(int dist[], int v) {
        System.out.println("Vertex\tDistance from source");
        for (int i = 0; i < v; i++) {
            System.out.println(i + "\t" + dist[i]);
        }
    }

    public static void main(String[] ajdb) {
        Bellman_Ford_Algo graph = new Bellman_Ford_Algo(5, 8);
        graph.edge[0].scr = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -1;

        graph.edge[1].scr = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 4;

        graph.edge[2].scr = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 3;

        graph.edge[3].scr = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 2;

        graph.edge[4].scr = 1;
        graph.edge[4].dest = 4;
        graph.edge[4].weight = 2;

        graph.edge[5].scr = 3;
        graph.edge[5].dest = 2;
        graph.edge[5].weight = 5;

        graph.edge[6].scr = 3;
        graph.edge[6].dest = 1;
        graph.edge[6].weight = 1;

        graph.edge[7].scr = 4;
        graph.edge[7].dest = 3;
        graph.edge[7].weight = -3;

        graph.BellmanFord(graph, 0);
    }
}
