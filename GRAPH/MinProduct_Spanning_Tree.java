package GRAPH;

import java.util.Arrays;
import java.util.Comparator;

public class MinProduct_Spanning_Tree {
    void makeset(int[] parent,int rank[],int n){
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }
    int findparent(int node,int parent[]){
        if(node==parent[node]){
            return node;
        }
        return parent[node]=findparent(parent[node],parent);
    }
    void unionset(int u,int v,int parent[],int rank[]){
        u=findparent(u, parent);
        v=findparent(v, parent);
        if(rank[u]<rank[v]){
            parent[u]=v;
        }
        else if(rank[v]<rank[u]){
            parent[v]=u;
        }
        else{
            parent[u]=v;
            rank[v]++;
        }
    }
    int minproduct(int graph[][],int n){
        int parent[]=new int[n];
        int rank[]=new int[n];
        makeset(parent, rank, n);
        Arrays.sort(graph,Comparator.comparingInt(o->o[2]));
        int minproduct=1;
        for(int i=0;i<n;i++){
            int u=findparent(graph[i][0], parent);
            int v=findparent(graph[i][1], parent);
            int wt=graph[i][2];
            if(u!=v){
                System.out.println(graph[i][0]+"--"+graph[i][1]+"-->"+wt);
                minproduct*=wt;
                unionset(u, v, parent, rank);
            }
        }
        return minproduct;
    }
    public static void main(String[] jeb){
        MinProduct_Spanning_Tree tree=new MinProduct_Spanning_Tree();
        int graph[][]={{0,1,2},{1,2,3},{0,3,6},{1,3,8},{1,4,5},{2,4,7},{3,4,9}};
        int n=graph.length;
        System.out.println(tree.minproduct(graph, n));
    }
}
