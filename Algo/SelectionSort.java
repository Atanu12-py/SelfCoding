package Algo;

public class SelectionSort {
    static void selection(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        int arr[]={64,25,12,22,11};
        int n=arr.length;
        selection(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
