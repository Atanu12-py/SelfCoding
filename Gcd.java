public class Gcd {
    static int findGcd(int arr[], int l, int r) {
        int gcd = 0;
        int finalgcd = -1;
        int small = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.println(small);
        for (int i = 1; i <= small; i++) {
            int l1 = l;
            int agcd=0;
            for (int j = 0; j <= r - l; j++) {
                if (arr[l1++] % i == 0) {
                    gcd =i;
                    agcd+=1;
                } 
            }
            if (agcd ==(r-l)+1) {
                finalgcd = gcd;
            }

        }
        return finalgcd;
    }

    public static void main(String[] jbd) {
        int arr[] = {7,21,49};
        int l = 0;
        int r = 2;
        System.out.println(findGcd(arr, l, r));
    }
}
