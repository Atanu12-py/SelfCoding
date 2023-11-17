public class RearrangeEvnSmallOddBig {

    static void arrange(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if((i%2==0) && (arr[i]>arr[i+1])){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            if((i%2!=0) && (arr[i]<arr[i+1])){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+"  ");
        }
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        arrange(arr, n);
    }
}