// Given an array of N integers, M ranges of indices as queries, and a specific index K, 
// the task is to right rotate the array circularly between query ranges, 
// and return the element at Kth index in the final array. 

public class FindKthEleAfterMRotation {
    static int rotation(int[] arr, int[][] queries, int m, int index) {
        for (int i = 0; i < m; i++) {
            for (int j = queries[i][1]; j > queries[i][0]; j--) {
                arr[j] = arr[j] + arr[j - 1];
                arr[j - 1] = arr[j] - arr[j - 1];
                arr[j] = arr[j] - arr[j - 1];
            }
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int queries[][] = { { 0, 2 }, { 0, 3 } };
        int m = 2;
        int index = 1;
        System.out.println(rotation(arr, queries, m, index));
    }
}
