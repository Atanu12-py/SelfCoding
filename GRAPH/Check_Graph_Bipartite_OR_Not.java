// package GRAPH;

// import java.util.LinkedList;

// public class Check_Graph_Bipartite_OR_Not {
//     static int V = 4;

//     static boolean isbipartiteutil(int graph[][], int scr, int colorarr[]) {
//         colorarr[scr] = 1;
//         LinkedList<Integer> q = new LinkedList<Integer>();
//         q.add(scr);
//         while (q.size() != 0) {
//             int u = q.getFirst();
//             q.pop();
//             if (graph[u][u] == 1) {
//                 return false;
//             }
//             for (int i = 0; i < V; i++) {
//                 if (graph[u][i] == 1 && colorarr[i] == -1) {
//                     colorarr[i] = 1 - colorarr[u];
//                     q.push(i);
//                 } else if (graph[u][i] == 1 && colorarr[u] == colorarr[i]) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     static boolean isbipartite(int graph[][]) {
//         int colorarr[] = new int[V];
//         for (int i = 0; i < V; i++) {
//             colorarr[i] = -1;
//         }
//         for (int i = 0; i < V; i++) {
//             if (colorarr[i] == -1) {
//                 if (isbipartiteutil(graph, i, colorarr) == false) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static void main(String[] bv) {
//         int G[][] = { { 0, 1, 0, 1 },
//                 { 1, 0, 1, 0 },
//                 { 0, 1, 0, 1 },
//                 { 1, 0, 1, 0 } };
//         if (isbipartite(G)) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }
// }

// Algorithm for Adjacency List*************

package GRAPH;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Check_Graph_Bipartite_OR_Not {
    static class pair {
        int first, second;

        pair(int f, int s) {
            first = f;
            second = s;
        }
    }

    static boolean isbipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int color[] = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = -1;
        }
        Queue<pair> q = new LinkedList<pair>();
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                q.add(new pair(i, 0));
                color[i] = 0;
                while (!q.isEmpty()) {
                    pair p = q.peek();
                    q.remove();
                    int v = p.first;
                    int c = p.second;
                    for (int j : adj.get(v)) {
                        if (color[j] == c) {
                            return false;
                        }
                        if (color[j] == -1) {
                            color[j] = (c == 1) ? 0 : 1;
                            q.add(new pair(j, color[j]));
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] wv) {
        int V,E;
        V=4;
        E=8;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(3);

        adj.get(1).add(0);
        adj.get(1).add(2);

        adj.get(2).add(1);
        adj.get(2).add(3);

        adj.get(3).add(0);
        adj.get(3).add(2);

        boolean ans=isbipartite(V, adj);
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}