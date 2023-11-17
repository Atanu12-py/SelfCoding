public class SplitArrAddEnd {
    static void splitArr(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            int x = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = x;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 5, 6, 7, 8 };
        int n = arr.length;
        int k = 2;
        splitArr(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
