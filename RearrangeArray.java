
// Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
// import java.lang.*;
import java.util.*;

public class RearrangeArray {
    static void arrangment(int[] arr, int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int p = 0;
        int q = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                arr[i] = temp[q];
                q--;
            } else {
                arr[i] = temp[p];
                p++;
            }
        }
    }

    static void printarr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 4, 5, 6, 8, 8 };
        int n = arr.length;
        arrangment(arr, n);
        printarr(arr, n);
    }
}

// // Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j]
// if i is odd and j < i
// // import java.lang.*;
// import java.util.*;

// public class RearrangeArray {
// static void arrangment(int[] arr, int n) {
// int temp[] = new int[n];
// for (int i = 0; i < n; i++) {
// temp[i] = arr[i];
// }
// Arrays.sort(temp);
// int evenpos=n/2;
// int oddpos=n-evenpos;
// int j=oddpos-1;
// for(int i=0;i<n;i+=2){
// arr[i]=temp[j];
// j--;
// }
// j=oddpos;
// for(int i=1;i<n;i+=2){
// arr[i]=temp[j];
// j++;
// }
// }

// static void printarr(int arr[], int n) {
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
// int n = arr.length;
// arrangment(arr, n);
// printarr(arr, n);
// // System.out.println(7%2);
// }
// }
