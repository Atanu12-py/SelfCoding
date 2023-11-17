package GRAPH;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Graph_Using_Set_Hashmap {
    HashMap<Integer, TreeSet<Integer>> graph;
    static int v;

    Graph_Using_Set_Hashmap() {
        graph = new HashMap<>();
        for (int i = 0; i < v; i++) {
            graph.put(i, new TreeSet<>());
        }
    }

    void addEdge(int scr, int dest) {
        graph.get(scr).add(dest);
        graph.get(dest).add(scr);
    }

    void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.println("Adjacency list of vertex " + i);
            Iterator set = graph.get(i).iterator();
            while (set.hasNext()) {
                System.out.print(set.next() + " ");
            }
            System.out.println();
        }
    }

    void searchNode(int scr, int dest) {
        if (graph.get(scr).contains(dest)) {
            System.out.println("From Source " + scr + "to Destination" + dest + " found");
        } else {
            System.out.println("From Source " + scr + " to Destination " + dest + " not found");
        }
    }

    public static void main(String[] jefb) {
        v = 5;
        Graph_Using_Set_Hashmap graph = new Graph_Using_Set_Hashmap();
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();

        graph.searchNode(3, 2);
        graph.searchNode(4, 2);
    }
}
