package GRAPH;

import java.util.*;

public class Print_All_Path_Between2 {
    static void print(List<Integer> path) {
        for (int v : path) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    static boolean isnotvisited(int x, List<Integer> path) {
        for (int v : path) {
            if (v == x) {
                return false;
            }
        }
        return true;
    }

    static void findpath(List<List<Integer>> edges, int s, int d, int v) {
        Queue<List<Integer>> qq = new LinkedList<>();
        List<Integer> path = new ArrayList<>();
        path.add(s);
        qq.offer(path);
        while (!qq.isEmpty()) {
            path = qq.poll();
            int last = path.get(path.size() - 1);

            if (last == d) {
                print(path);
            }

            List<Integer> lastnode = edges.get(last);

            // for (int i = 0; i < lastnode.size(); i++) {
                // if (isnotvisited(lastnode.get(i), path)) {
                //     List<Integer> newpath = new ArrayList<>(path);
                //     newpath.add(lastnode.get(i));
                //     qq.offer(newpath);

                // }
                
            // }
            for(int i:lastnode){
                if(isnotvisited(i, path)){
                    List<Integer> newpath = new ArrayList<>(path);
                    newpath.add(i);
                    qq.offer(newpath);

                }
            }
        }

    }

    public static void main(String[] fh) {
        List<List<Integer>> edges = new ArrayList<>();
        int v = 4;
        for (int i = 0; i < v; i++) {
            edges.add(new ArrayList<>());
        }
        edges.get(0).add(1);
        edges.get(0).add(2);
        edges.get(0).add(3);
        edges.get(1).add(3);
        edges.get(2).add(0);
        edges.get(2).add(1);
        int s = 2, d = 3;
        findpath(edges, s, d, v);
    }
}
