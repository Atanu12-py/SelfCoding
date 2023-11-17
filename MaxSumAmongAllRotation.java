// Maximum sum of i*arr[i] among all rotations of a given array

public class MaxSumAmongAllRotation {
    static int FindMAxSum(int arr[], int n) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int index = (i + j) % n;
                sum += j * (arr[index]);
            }
            res = Integer.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 1, 2};
        int n = arr.length;
        System.out.println(FindMAxSum(arr, n));
    }
}
