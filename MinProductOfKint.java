import java.util.*;

public class MinProductOfKint {
    static int minimumProduct(int arr[], int n, int k) {
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 0; i < k; i++) {
            ans *= arr[i];
        }
        return ans;

    }

    public static void main(String[] wjbd) {
        // int arr[] = { 198, 76, 544, 123, 154, 675 };
        int arr[] = { 11 ,8, 5, 7, 5, 100 };
        int n = arr.length;
        int k = 4;
        System.out.println(minimumProduct(arr, n, k));
    }
}
