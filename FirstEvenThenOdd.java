public class FirstEvenThenOdd {
    static void evenOdd(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] dcuc) {
        // int arr[]={1,9,7,2,3,6,5,4};
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int n = arr.length;
        evenOdd(arr, n);
    }
}
