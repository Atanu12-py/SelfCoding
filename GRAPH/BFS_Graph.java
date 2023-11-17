package GRAPH;

import java.util.Iterator;
import java.util.LinkedList;

class BFS_Graph {
    private int v;
    private LinkedList<Integer> adj[];

    BFS_Graph(int V) {
        v = V;
        adj = new LinkedList[v];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int e) {
        adj[v].add(e);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;
        while (queue.size() != 0) {
            int ele = queue.poll();
            System.out.print(ele+"  ");

            Iterator<Integer> i=adj[ele].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] jed){
        BFS_Graph bfs=new BFS_Graph(4);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 3);
        bfs.addEdge(2, 0);
        bfs.addEdge(3, 3);

        bfs.BFS(2);
    }
}