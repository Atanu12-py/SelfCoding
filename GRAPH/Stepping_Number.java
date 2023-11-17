package GRAPH;

public class Stepping_Number {
    boolean isstepping(int n) {
        int prevdigit = -1;
        while (n > 0) {
            int currdigit = n % 10;
            if (prevdigit != -1) {
                if (Math.abs(currdigit - prevdigit) != 1) {
                    return false;
                }
            }
            prevdigit = currdigit;
            n = n / 10;
        }
        return true;
    }

    void printstepping(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isstepping(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] jeb) {
        int n = 0;
        int m = 21;
        Stepping_Number step = new Stepping_Number();
        step.printstepping(n, m);
    }
}
