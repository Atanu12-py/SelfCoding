public class MoveZeroToEnd {
    static void movezero(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        for(int i=count;i<n;i++){
            arr[i]=0;
        }
    }

    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] js) {
        int arr[] = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
        int n = arr.length;
        movezero(arr, n);
        print(arr, n);
    }
}
