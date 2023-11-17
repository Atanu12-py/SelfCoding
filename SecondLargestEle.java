public class SecondLargestEle {
    static int secondLarge(int arr[],int n){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        return second;

    }
    public static void main(String[] jhd){
        int arr[]={12, 35, 1, 10, 34, 1};
        int n=arr.length;
        System.out.println(secondLarge(arr, n));
    }
}
