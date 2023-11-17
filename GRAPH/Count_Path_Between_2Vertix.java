package GRAPH;

import java.util.Iterator;
import java.util.LinkedList;

public class Count_Path_Between_2Vertix {
    int v;
    LinkedList<Integer> adj[];

    Count_Path_Between_2Vertix(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    int pathCount(int s, int d, int count) {
        if (s == d) {
            count++;
        } else {
            Iterator<Integer> itr = adj[s].iterator();
            while (itr.hasNext()) {
                int n = itr.next();
                count = pathCount(n, d, count);

            }
        }
        return count;
    }

    int pathCount(int s, int d) {
        int count = 0;
        count = pathCount(s, d, count);
        return count;
    }

    public static void main(String[] bdwud) {
        Count_Path_Between_2Vertix path = new Count_Path_Between_2Vertix(5);
        path.addEdge(0, 1);
        path.addEdge(0, 2);
        path.addEdge(0, 3);
        path.addEdge(1, 3);
        path.addEdge(2, 3);
        path.addEdge(1, 4);
        path.addEdge(4, 2);
        // path.addEdge(2, 1);

        int s = 0, d = 3;
        System.out.println(path.pathCount(s, d));

        // If Graph contain any cycle then this algo
    }
}
