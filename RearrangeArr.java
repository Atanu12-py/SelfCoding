/**
 * RearrangeArr
 */
public class RearrangeArr {

    static void arrange(int[] arr, int n) {
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (arr[j] == i) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            if (arr[k] != k) {
                arr[k] = -1;
            }
        }
    }

    public static void main(String[] jd) {
        int[] arr = { -1, -1, 6, 1, 9,
                3, 2, -1, 4, -1 };
        int n=arr.length;
        arrange(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}