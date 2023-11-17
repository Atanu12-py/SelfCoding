import java.util.*;

public class KthLargestSum {
    static int KthLargestFromSubArr(int arr[], int n, int k) {
        int sum[] = new int[n + 1];
        sum[0] = 0;
        sum[1] = arr[0];
        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i - 1] + arr[i - 1];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int x = sum[j] - sum[i - 1];
                if (pq.size() < k) {
                    pq.add(x);
                } 
                else {
                    int p=pq.peek();
                    if (p < x) {
                        pq.add(x);
                    }
                }
            }
        }
        int poll=pq.poll();
        return poll;
    }
    public static void main(String[] sx){
        int arr[]={10,-10,20,-40};
        int n=arr.length;
        int k=6;
        System.out.println(KthLargestFromSubArr(arr, n, k));
    }
}
