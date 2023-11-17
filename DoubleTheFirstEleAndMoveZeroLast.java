public class DoubleTheFirstEleAndMoveZeroLast {
    static void moveZeroToEnd(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
    }
    static void rearrange(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]!=0 && arr[i]==arr[i+1]){
                arr[i]=arr[i]*2;
                arr[i+1]=0;
                i++;
            }
        }
        moveZeroToEnd(arr, n);
    }
    public static void main(String[] jdg){
        int arr[]={0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
        int n=arr.length;
        rearrange(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
