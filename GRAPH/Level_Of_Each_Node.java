package GRAPH;

import java.util.*;

import org.w3c.dom.css.ViewCSS;

public class Level_Of_Each_Node {
    int v;
    LinkedList<Integer> adj[];
    Level_Of_Each_Node(int val){
        v=val;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }
    void addEdge(int v,int u){
        adj[v].add(u);
        // adj[u].add(v);
    }
    void printlevel(int n){
        boolean[] visited=new boolean[v];
        int level[]=new int[v];

        visited[n]=true;
        level[n]=0;

        Queue<Integer> qq=new LinkedList<Integer>();

        qq.add(n);
        while(!qq.isEmpty()){
            int s=qq.poll();
            Iterator<Integer> i=adj[s].iterator();
            while(i.hasNext()){
                int k=i.next();
                if(!visited[k]){
                    visited[k]=true;
                    level[k]=level[s]+1;
                    qq.add(k);
                }
            }
        }
        System.out.println("Nodes"+"  "+"Levels");
        for(int i=0;i<v;i++){
            System.out.println(i+"  "+level[i]);
        }
    }
    public static void main(String[] jeb){
        Level_Of_Each_Node level=new Level_Of_Each_Node(7);
        level.addEdge(0, 1);
        level.addEdge(0, 2);
        level.addEdge(1, 3);
        level.addEdge(1, 4);
        level.addEdge(1, 5);
        // level.addEdge(2, 5);
        level.addEdge(2, 6);
        // level.addEdge(6, 7);

        level.printlevel(0);
    }
}
