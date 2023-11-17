package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class Stepping_Num_BFS {
    public void Stepping_num(int n, int m, int num) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(num);
        while (!q.isEmpty()) {
            int stepnum = q.poll();
            if (stepnum >= n && stepnum <= m) {
                System.out.print(stepnum + " ");
            }
            if (stepnum == 0 || stepnum > m) {
                continue;
            }
            int lastdigit = stepnum % 10;
            int stepnumA = stepnum * 10 + (stepnum - 1);
            int stepnumB = stepnum * 10 + (stepnum + 1);

            if (lastdigit == 0) {
                q.add(stepnumB);
            } else if (lastdigit == 9) {
                q.add(stepnumA);
            } else {
                q.add(stepnumA);
                q.add(stepnumB);
            }
        }
    }

    public void displayStepnum(int n, int m) {
        for (int i = 0; i <= 9; i++) {
            Stepping_num(n, m, i);
        }
    }

    public static void main(String[] jdb) {
        int n = 0, m = 21;
        Stepping_Num_BFS step = new Stepping_Num_BFS();
        step.displayStepnum(n, m);
    }
}
