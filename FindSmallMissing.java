// public class FindSmallMissing {
//     static int findSmallest(int[] arr,int n,int m){
//         if(arr[0]!=0){
//             return 0;
//         }
//         for(int i=0;i<n-1;i++){
//             if(arr[i+1]-arr[i]!=1){
//                 return arr[i]+1;
//             }
//         }
//         return n;
//     }
//     public static void main(String[] bd){
//         int[] arr={0,1,2,3,4,5,9};
//         int n=arr.length;
//         int m=10;
//         System.out.println(findSmallest(arr, n, m));
//     }
// }

public class FindSmallMissing {
    static int findsmallmissing(int arr[], int start, int end) {
        if (start > end) {
            return end + 1;
        }
        if (start != arr[start]) {
            return start;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == mid) {
            return findsmallmissing(arr, mid + 1, end);
        }
        return findsmallmissing(arr, start, mid);
    }

    public static void main(String[] wjb) {
        int arr[] = { 1, 2, 3, 4, 5, 9 };
        int n = arr.length;
        int start = 0;
        System.out.println(findsmallmissing(arr, start, n));
    }
}