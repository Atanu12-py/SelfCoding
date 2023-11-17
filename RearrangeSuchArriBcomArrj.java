public class RearrangeSuchArriBcomArrj {
    static void arribecomearrj(int[] arr, int n) {
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[arr[i]] = i;
        }
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] jewhbef) {
        int[] arr = { 2, 0, 1, 4, 5, 3 };
        int n = arr.length;
        arribecomearrj(arr, n);
    }
}
