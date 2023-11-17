// public class arrRotation {
//     static void arrrotation(int[] arr, int d, int n){
//         int temp[]=new int[n];
//         // int k=0;
//         for(int i=d;i<n;i++){
//             temp[i-d]=arr[i];
//             // System.out.print(temp[i-d]);
//             // k++;
//         }
//         for(int j=0;j<d;j++){
//             temp[n-d+j]=arr[j];
//             // k++;
//         }
//         for(int i=0;i<n;i++){
//             arr[i]=temp[i];
//         }

//     }
//     static void printarray(int[] arr,int n){
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,6};
//         int n=arr.length;
//         int d=2;
//         // printarray(arr, n);
//         arrrotation(arr, d, n);
//         printarray(arr, n);
//     }

// }

// using while looop....................//////////

// class Gfg {
//     // int p=0;
//     static void arrrotation(int[] arr, int d, int n) {
//         int p = 0;
//         while (p < d) {
//             int last = arr[0];
//             for (int i = 0; i < n - 1; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             arr[n - 1] = last;
//             p++;
//         }
//     }

//     static void printarr(int arr[], int n) {
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
//         int n = arr.length;
//         int d = 3;
//         arrrotation(arr, d, n);
//         printarr(arr, n);
//     }
// }

class arrRotation {
    static void right_rotate(int[] arr, int d, int n) {
        int i, j;
        for (i = 0; i < d; i++) {
            for (j = n - 1; j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
                arr[j - 1] = arr[j] - arr[j - 1];
                arr[j] = arr[j] - arr[j - 1];
            }
        }
    }

    static void left_rotate(int arr[], int n, int d) {
        int i, j;
        for (i = 0; i < d; i++) {
            for (j = 0; j < n - 1; j++) {
                arr[j] = arr[j] + arr[j + 1];
                arr[j + 1] = arr[j] - arr[j + 1];
                arr[j] = arr[j] - arr[j + 1];
            }
        }
    }

    static void printarr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int d = 3;
        right_rotate(arr, d, n);
        // left_rotate(arr, n, d);
        printarr(arr, n);
        // for(int i=0;i<10;++i){
        //     System.out.println(i);
        // }
    }
}
