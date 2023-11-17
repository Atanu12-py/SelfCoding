public class Factorial {
    // public static int fact(int n){
    // if(n==0){
    // return 1;
    // }
    // int sp=fact(n-1);
    // int bp=n*sp;
    // return bp;
    // }

    public static int fact(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 1;
        for (int i = 1; i <= n; i++) {
            arr[i] = i * arr[i - 1];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(fact(60));
    }
}
