// public class ReverseArray {
//     static void reverse(int[] arr,int start,int end){
//         int temp;
//         while(start<end){
//             temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }
//     }
//     static void printarr(int arr[],int n){
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] ajd){
//         int arr[]={1,2,3,4,5,6,7};
//         int start=0;
//         int end=arr.length-1;
//         reverse(arr, start, end);
//         printarr(arr, end+1);
//     }
// }






public class ReverseArray {
    static void reverse(int[] arr,int start,int end){
        int temp;
        if(start>end){
            return;
        }
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr, start+1, end-1);

    }
    static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] ajd){
        int arr[]={1,2,3,4,5,6,7};
        int start=0;
        int end=arr.length-1;
        reverse(arr, start, end);
        printarr(arr, end+1);
    }
}
