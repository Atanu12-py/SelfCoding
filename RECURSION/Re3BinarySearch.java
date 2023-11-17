public class Re3BinarySearch {
    public static boolean binary(int arr[],int s,int e,int k){
        if(s>e){
            return false;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==k){
            return true;
        }
        if(arr[mid]<k){
            return binary(arr, mid+1, e, k);
        }
        else{
            return binary(arr, s, mid-1, k);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        // System.out.println(binary(arr,0,arr.length-1,50));
        Integer a=5;
        Integer b=5;
        System.out.println(a==b);
    }
}
