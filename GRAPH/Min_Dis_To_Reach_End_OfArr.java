package GRAPH;

import java.util.*;

public class Min_Dis_To_Reach_End_OfArr {
    static int mindis(int arr[], int n) {
        boolean[] visit = new boolean[n];
        int distance[] = new int[n];

        Vector<Integer> digit[] = new Vector[10];
        for (int i = 0; i < 10; i++) {
            digit[i] = new Vector<>();
        }
        for (int i = 1; i < n; i++) {
            digit[arr[i]].add(i);
        }

        distance[0] = 0;
        visit[0] = true;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            if (idx == n - 1) {
                break;
            }
            int d = arr[idx];

            for (int i = 0; i < digit[d].size(); i++) {
                int nextidx = digit[d].get(i);
                if (!visit[nextidx]) {
                    visit[nextidx] = true;
                    queue.add(nextidx);
                    distance[nextidx] = distance[idx] + 1;
                }
            }
            digit[d].clear();
            if (idx - 1 >= 0 && !visit[idx - 1]) {
                visit[idx - 1] = true;
                queue.add(idx - 1);
                distance[idx - 1] = distance[idx] + 1;
            }
            if (idx + 1 < n && !visit[idx + 1]) {
                visit[idx + 1] = true;
                queue.add(idx + 1);
                distance[idx + 1] = distance[idx] + 1;
            }
        }
        return distance[n - 1];
    }

    public static void main(String[] jwb) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 5,
                4, 3, 6, 0, 1, 2, 3, 4, 5, 7 };

        int n = arr.length;
        System.out.println(mindis(arr, n));
    }
}

