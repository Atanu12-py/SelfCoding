public class PrintNums {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print(n - 1);
    }
    public static void main(String[] args) {
        print(10);
    }
}
