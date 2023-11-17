// Rearrange array such that even positioned are greater than odd

public class RearrangeArrEvenOdd {
    static void rearrange(int arr[],int n){
        for(int i=1;i<n;i++){
            if(i%2==0){
                if(arr[i]>arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
            else{
                if(arr[i]<arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] jdb){
        int arr[]={3,1,1,5};
        int n=arr.length;
        rearrange(arr, n);
    }
}
