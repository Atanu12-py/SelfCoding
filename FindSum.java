// Find if there is a pair with a given sum in the rotated sorted Array

public class FindSum {
    static boolean findSumFromArray(int[] arr, int n, int x) {
        int i;
        for (i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }
        int l = (i+1) % n;
        int r = i;
        while (l != r) {
            if (arr[l] + arr[r] == x) {
                return true;
            }
            if (arr[l] + arr[r] < x) {
                l = (l + 1) % n;
            } else {
                r = (n + r - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int n = arr.length;
        int x = 20;
        if (findSumFromArray(arr, n, x)) {
            System.out.println("True...! It's Possible");
        } else {
            System.out.println("False...! It's  not Possible");
        }
    }
}
