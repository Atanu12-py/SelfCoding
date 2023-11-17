public class Rec3IsSorted {
    public static boolean sorted(int arr[], int size) {
        if (size == 0 || size == 1) {
            return true;
        }
        if(arr[size-2]>arr[size-1]){
            return false;
        }
        return sorted(arr, size-1);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2};
        int n=arr.length;
        System.out.println(sorted(arr, n));
    }
}
