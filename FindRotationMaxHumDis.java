public class FindRotationMaxHumDis {
    static int hummingDistance(int[] arr, int n) {
        int brr[] = new int[2 * n + 1];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[i];
            brr[n + i] = arr[i];
        }
        int mxhum = 0;
        for (int i = 1; i < n; i++) {
            int currhum = 0;
            for (int j = i, k = 0; j < n + i; j++, k++) {
                if (brr[j] != brr[k]) {
                    currhum++;
                }
            }
            if (currhum == n) {
                return currhum;
            }
            mxhum = Math.max(mxhum, currhum);
        }
        return mxhum;
    }

    public static void main(String[] args) {
        int arr[] = { 1,4,1 };
        int n = arr.length;
        System.out.println(hummingDistance(arr, n));
    }
}
