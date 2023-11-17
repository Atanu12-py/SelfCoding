// public class RotationCount {
//     static int rotationcount(int[] arr, int n) {
//         int i = 0;
//         for (i = 0; i < n - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 break;
//             }
//         }
//         return i + 1;
//     }

//     public static void main(String[] ahd) {
//         int arr[] = { 15, 18,20, 2, 3, 4, 5 };
//         int n = arr.length;
//         System.out.println(rotationcount(arr, n));
//     }
// }

/////USING BINARY SEARCH METHOD

public class RotationCount {
    static int rotationcount(int[] arr,int low,int high){
        if(low>high){
            return 0;
        }
        if(low==high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(mid>low && arr[mid]<arr[mid-1]){
            return mid;
        }
        if(mid>high && arr[mid+1]<arr[mid]){
            return mid+1;
        }
        if(arr[high]>arr[mid]){
            return rotationcount(arr, low, mid-1);
        }
        return rotationcount(arr, mid+1, high);

    }
    public static void main(String[] ahd) {
                int arr[] = { 15, 18, 2, 3, 4, 5 };
                int n = arr.length;
                System.out.println(rotationcount(arr, 0,n-1));
            }
    
}
