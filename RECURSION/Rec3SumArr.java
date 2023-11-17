public class Rec3SumArr{
    public static int sum(int arr[],int n){
        if(n==arr.length){
            return 0;
        }
        int ans=arr[n]+sum(arr, n+1);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,9,9,9};
        System.out.println(sum(arr, 0));
    }
}