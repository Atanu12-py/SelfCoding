public class MoveNegToBeginAndVicVersa {
    public static void negToBeiningPosToEnd(int[] arr, int n) {
        int i = 0;
        int temp[] = arr.clone();
        for (int j = 0; j < n; j++) {
            if (temp[j] < 0) {
                arr[i++] = temp[j];
            }
        }
        for (int k = 0; k < n; k++) {
            if (temp[k] >= 0) {
                arr[i++] = temp[k];
            }
        }

        for (int a = 0; a < n; a++) {
            System.out.print(arr[a] + "  ");
        }
    }

    public static void main(String[] wjbd) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int n = arr.length;
        negToBeiningPosToEnd(arr, n);
    }
}
