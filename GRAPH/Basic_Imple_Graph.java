package GRAPH;

import java.util.*;

public class Basic_Imple_Graph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printadj(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("List of vertex " + i);
            System.out.print(i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print("-->" + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] eb){
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printadj(adj);
    }
}

// public static void main(String[] args) {
// try (Scanner sc = new Scanner(System.in)) {
// System.out.println("Enter N");
// int n = sc.nextInt();
// System.out.println("Enter M");
// int m = sc.nextInt();

// int[][] adj = new int[n + 1][n + 1];
// for (int i = 0; i < m; i++) {
// System.out.println("Enter U");
// int u = sc.nextInt();
// System.out.println("Enter V");
// int v = sc.nextInt();
// adj[u][v] = 1;
// adj[v][u] = 1;
// }
// System.out.println(" "+0+" "+1+" "+2+" "+3+" "+4+" ");
// for (int i = 0; i < adj.length; i++) {
// for (int j = -1; j < adj[i].length; j++) {
// if(j==-1){
// System.out.print(i+" ");
// }
// else{
// System.out.print(adj[i][j] + " ");
// }
// }
// System.out.println();
// }
// }
// }