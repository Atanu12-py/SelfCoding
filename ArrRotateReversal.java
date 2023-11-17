

public class ArrRotateReversal {
    static void leftrorate(int[] arr, int d) {
        if (d == 0) {
            return;
        }
        int n = arr.length;
        d = d % n;
        reverseArr(arr, 0, d - 1);
        reverseArr(arr, d, n - 1);
        reverseArr(arr, 0, n - 1);

    }

    static void reverseArr(int[] arr, int start, int end) {
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
    }
    static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int d=2;
        leftrorate(arr, d);
        printarr(arr);
    }
}
