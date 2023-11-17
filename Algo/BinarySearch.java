package Algo;

public class BinarySearch {
    static int binary(int arr[],int low,int high,int key){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(key>arr[mid]){
            return binary(arr, mid+1, high, key);
        }
        else{
            return binary(arr, low, mid-1, key);
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int low=0;
        int high=arr.length-1;
        int key=4;
        System.out.println(binary(arr, high, low, key));
    }
}
