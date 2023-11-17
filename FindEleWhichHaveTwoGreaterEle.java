

public class FindEleWhichHaveTwoGreaterEle {
    // static void findElement(int arr[], int n) {
    //     for (int i = 0; i < n; i++) {
    //         int count = 0;
    //         for (int j = 0; j < n; j++) {
    //             if (arr[i] < arr[j]) {
    //                 count++;
    //             }
    //         }
    //         if (count >= 2) {
    //             System.out.print(arr[i] + "  ");
    //         }
    //     }
    // }

    static void findElement(int arr[],int n){
        int first=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                second=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<second){
                System.out.print(arr[i]+"  ");
            }
        }
    }

    public static void main(String[] jsbd) {
        int arr[] = { 2, -1, 5, 3, 1 };
        int n = arr.length;
        findElement(arr, n);
    }
}
