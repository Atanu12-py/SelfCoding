public class Rec4BubbleSort {
    public static void bubble(int arr[], int n) {
        if (n == 0 || n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubble(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 8, 4, 3 ,0,-1,-11,100};
        bubble(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
