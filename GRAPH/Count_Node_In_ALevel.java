package GRAPH;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Count_Node_In_ALevel {
    int v;
    LinkedList<Integer> adj[];

    Count_Node_In_ALevel(int val) {
        v = val;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    void BFS(int s, int l) {
        boolean visisted[] = new boolean[v];
        int level[] = new int[v];
        Queue<Integer> qq = new LinkedList<>();

        visisted[s] = true;
        level[s] = 0;
        qq.add(s);

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(s, level[s]);

        while (!qq.isEmpty()) {
            int n = qq.peek();
            qq.poll();
            Iterator<Integer> itr = adj[n].iterator();
            while (itr.hasNext()) {
                int i = itr.next();
                if (!visisted[i]) {
                    visisted[i] = true;
                    level[i] = level[n] + 1;
                    qq.add(i);
                    map.put(i, level[i]);

                }
            }
        }
        count = 0;
        for (int i = 0; i < v; i++) {
            if (level[i] == l) {
                count++;
                // System.out.print(map.get(level[i]));
            }
        }
        // return count;
        System.out.println(count);
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) == l) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] ehhe) {
        Count_Node_In_ALevel level = new Count_Node_In_ALevel(6);
        level.addEdge(0, 1);
        level.addEdge(0, 2);
        level.addEdge(1, 3);
        level.addEdge(2, 4);
        level.addEdge(2, 5);
        int l = 2;
        level.BFS(0, l);
    }
}
