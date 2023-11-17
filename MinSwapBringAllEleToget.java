public class MinSwapBringAllEleToget {
    static int swap(int[] arr,int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                ++count;
            }
        }
        int bad=0;
        for(int i=0;i<count;i++){
            if(arr[i]>k){
                ++bad;
            }
        }
        int ans=bad;
        for(int i=0, j=count;j<n;j++,i++){
            if(arr[i]>k){
                --bad;
            }
            if(arr[j]>k){
                ++bad;
            }
            ans=Math.min(ans, bad);
        }
        return ans;
    }
    static void ptint(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] jdbc){
        int arr[]={2,1,5,7,3};
        int n=arr.length;
        System.out.println(swap(arr, n, 3));
        // ptint(arr, n);
    }
}

