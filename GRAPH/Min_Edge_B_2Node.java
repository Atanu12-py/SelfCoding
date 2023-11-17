package GRAPH;

import java.util.*;

public class Min_Edge_B_2Node {
    static int minEdge(Vector<Integer> edges[],int u,int v,int n){
        boolean visited[]=new boolean[n];
        int distance[]=new int[n];

        Queue<Integer> qq=new LinkedList<Integer>();
        qq.add(u);
        visited[u]=true;
        while(!qq.isEmpty()){
            int x=qq.poll();
            for(int i:edges[x]){
                if(!visited[i]){
                    distance[i]=distance[x]+1;
                    visited[i]=true;
                    qq.add(i);
                }
            }
        }
        return distance[v];

    }static void addEdge(Vector<Integer> edges[],int u,int v){
        edges[u].add(v);
        edges[v].add(u);
    }
    public static void main(String[] jb){
        int n=9;
        Vector<Integer> edges[]=new Vector[n];
        for(int i=0;i<n;i++){
            edges[i]=new Vector<>();
        }
        // addEdge(edges, 0, 1);
        // addEdge(edges, 0, 2);
        // addEdge(edges, 0, 4);
        // addEdge(edges, 1, 2);
        // addEdge(edges, 2, 5);
        // addEdge(edges, 4, 5);
        // addEdge(edges, 4, 6);
        // addEdge(edges, 4, 3);
        addEdge(edges, 0, 1);
        addEdge(edges, 0, 7);
        addEdge(edges, 1, 7);
        addEdge(edges, 1, 2);
        addEdge(edges, 2, 3);
        addEdge(edges, 2, 5);
        addEdge(edges, 2, 8);
        addEdge(edges, 3, 4);
        addEdge(edges, 3, 5);
        addEdge(edges, 4, 5);
        addEdge(edges, 5, 6);
        addEdge(edges, 6, 7);
        addEdge(edges, 7, 8);

        System.out.println(minEdge(edges, 0, 5, n));
        
    }
}
