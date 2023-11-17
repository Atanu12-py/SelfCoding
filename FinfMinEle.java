public class FinfMinEle {
    static int findMinEle(int arr[],int low,int high){
        if(low>high){
            return 0;
        }
        if(low==high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(mid<high && arr[mid]>arr[mid+1]){
            return arr[mid+1];
        }
        if(mid>low && arr[mid]<arr[mid-1]){
            return arr[mid];
        }
        if(arr[high]>arr[mid]){
            return findMinEle(arr, low, mid-1);
        }
        return findMinEle(arr, mid+1, high);
    }
    public static void main(String[] kd){
        int arr[]={3,4,5,1,2};
        int low=0;
        int high=arr.length-1;
        System.out.println(findMinEle(arr, low, high));
    }
}
