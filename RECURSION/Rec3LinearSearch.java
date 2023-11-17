public class Rec3LinearSearch {
    public static boolean linear(int arr[], int n, int k) {
        if (n == arr.length) {
            return false;
        }
        if (arr[n] == k) {
            return true;
        } else {
            boolean ans = linear(arr, n + 1, k);
            return ans;
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 1, 2, 7, 5, 9 };
        System.out.println(linear(arr, 0, 10));
    }
}
