public class ReplaceArrMulOfPreAndNextEle {
    static void replaceArray(int arr[],int n){
        if(n<=1){
            return;
        }
        int prev=arr[0];
        arr[0]=prev*arr[1];

        for(int index=1;index<n-1;index++){
            int curr=arr[index];
            arr[index]=prev*arr[index+1];
            prev=curr;
        }
        arr[n-1]=prev*arr[n-1];
    }
    static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] sdh){
        int arr[]={2,3,4,5,6};
        int n=arr.length;
        replaceArray(arr, n);
        printArr(arr, n);
    }
}
