package GRAPH;

public class TSP {
    int n = 4;
    int visited_all = (1 << n) - 1;

    int tsp(int graph[][], int mask, int pos) {
        if (mask == visited_all) {
            return graph[pos][0];
        }
        int ans = Integer.MAX_VALUE;
        for (int city = 0; city < n; city++) {
            if ((mask & (1 << city)) == 0) {
                int newans = graph[pos][city] + tsp(graph, mask | (1 << city), city);
                ans = Math.min(ans, newans);
            }
        }
        return ans;
    }

    public static void main(String[] jbf) {
        int graph[][] = { { 0, 20, 42, 25 }, { 20, 0, 30, 34 }, { 42, 30, 0, 10 }, { 25, 34, 10, 0 } };
        TSP sp = new TSP();
        System.out.println(sp.tsp(graph, 1, 0));
    }
}
