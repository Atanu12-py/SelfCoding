// import java.util.*;

// public class MeanMedian {
//     static double calculateMedian(int arr[], int n) {
//         Arrays.sort(arr);
//         if (n % 2 == 0) {
//             return (double) (arr[n / 2] + arr[n / 2 - 1]) / 2;
//         }

//         return (double) (arr[n / 2]);
//     }

//     static double mean(int arr[], int n) {
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += arr[i];
//         }
//         return (double) sum / (double) n;
//     }

//     public static void main(String[] jdc) {
//         int arr[] = { 1, 3, 4, 2, 7, 5, 8, 6};
//         int n = arr.length;
//         double a = calculateMedian(arr, n);
//         double b = mean(arr, n);
//         System.out.println("Median " + a);
//         System.out.println("Mean " + b);
//     }
// }


// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n1=nums1.length;
//         int n2=nums2.length;
//         int n=n1+n2;
//         int arr[]=new int[n];
//         int l=0;
//         int sum=0;
//         for(int i=0;i<n1;i++){
//             arr[l]=nums1[i];
//             l++;
//             sum+=nums1[i];
//         }
//         for(int j=0;j<n2;j++){
//             arr[l]=nums2[j];
//             l++;
//             sum+=nums2[j];
//         }
//         if(n%2!=0){
//             return (double) sum/ (double)n;
//         }
//         else if{
//             return (double) (arr[n/2]+arr[n/2-1])/2;
//         }
        
//     }
// }