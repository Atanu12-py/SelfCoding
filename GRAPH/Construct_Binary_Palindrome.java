package GRAPH;

import java.util.*;

public class Construct_Binary_Palindrome {
    static void dfs(int parent, int ans[], Vector<Integer>[] connectgraph) {
        ans[parent] = 1;
        for (int i = 0; i < connectgraph[parent].size(); i++) {
            if (ans[connectgraph[parent].get(i)] != 1) {
                dfs(connectgraph[parent].get(i), ans, connectgraph);
            }
        }
    }

    static void printbinarypalin(int n, int k) {
        int[] arr = new int[n];
        int[] ans = new int[n];

        Vector<Integer> connectchar[] = new Vector[k];
        for (int i = 0; i < k; i++) {
            connectchar[i] = new Vector<Integer>();
        }

        for (int i = 0; i < n; i++) {
            arr[i] = i % k;
        }

        for (int i = 0; i < n / 2; i++) {
            connectchar[arr[i]].add(arr[n - i - 1]);
            connectchar[arr[n - i - 1]].add(arr[i]);
        }
        dfs(0, ans, connectchar);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[arr[i]]);
        }
    }

    public static void main(String[] jdb) {
        printbinarypalin(10, 4);
    }
}
