package GRAPH;

import java.util.*;;

public class Find_K_core {
    int v;
    Vector<Integer>[] adj;

    @SuppressWarnings("unchecked")
    Find_K_core(int val) {
        v = val;
        adj = new Vector[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new Vector<>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    boolean DFSUtil(int n, boolean visisted[], int vdegree[], int k) {
        visisted[n] = true;
        for (int i : adj[n]) {
            if (vdegree[n] < k) {
                vdegree[i]--;
            }
            if (!visisted[i]) {
                DFSUtil(i, visisted, vdegree, k);
            }
        }
        return vdegree[n] < k;
    }

    void printcores(int k) {
        boolean visisted[] = new boolean[v];
        boolean processed[] = new boolean[v];
        Arrays.fill(visisted, false);
        Arrays.fill(processed, false);

        int mindegree = Integer.MAX_VALUE;
        int startpoint = 0;
        int vdegree[] = new int[v];
        for (int i = 0; i < v; i++) {
            vdegree[i] = adj[i].size();
            if (vdegree[i] < mindegree) {
                mindegree = vdegree[i];
                startpoint = i;
            }
        }
        DFSUtil(startpoint, visisted, vdegree, k);
        for (int i = 0; i < v; i++) {
            if (!visisted[i]) {
                DFSUtil(i, visisted, vdegree, k);
            }
        }
        System.out.println("K-Cores");
        for (int i = 0; i < v; i++) {
            if (vdegree[i] >= k) {
                System.out.printf("\n[%d]", i);
                for (int j : adj[i]) {
                    if (vdegree[j] >= k) {
                        System.out.printf(" -> %d", j);
                    }
                }
            }
        }

    }

    public static void main(String[] jebf) {
        int k = 3;
        Find_K_core g1 = new Find_K_core(9);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(1, 5);
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(2, 5);
        g1.addEdge(2, 6);
        g1.addEdge(3, 4);
        g1.addEdge(3, 6);
        g1.addEdge(3, 7);
        g1.addEdge(4, 6);
        g1.addEdge(4, 7);
        g1.addEdge(5, 6);
        g1.addEdge(5, 8);
        g1.addEdge(6, 7);
        g1.addEdge(6, 8);
        g1.printcores(k);
    }
}
