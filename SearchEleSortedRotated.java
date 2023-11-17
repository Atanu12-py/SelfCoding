

public class SearchEleSortedRotated {
    static int pivotbinarysearch(int[] arr,int n,int key){
        int pivot=findpivot(arr,0,n-1);
        if(pivot==-1){
            return binarsearch(arr, 0, n-1, key);
        }
        if(arr[pivot]==key){
            return pivot;
        }
        if(arr[0]<=key){
            return binarsearch(arr, 0, pivot-1, key);
        }
        return binarsearch(arr, pivot+1, n-1, key);



    }

    static int findpivot(int[] arr, int low, int high) {
        if (high < low) {
            return -1;
        }
        if (high == low) {
            return low;
        }

        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid < low && arr[mid] < arr[mid - 1]) {
            return (mid - 1);
        }
        if (arr[low] >= arr[mid]) {
            return findpivot(arr, low, mid - 1);
        }
        return findpivot(arr, mid + 1, high);

    }

    static int binarsearch(int[] arr, int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (key == arr[mid]) {
            return mid;
        }
        if (key > arr[mid]) {
            return binarsearch(arr, mid + 1, high, key);
        }
        return binarsearch(arr, low, mid - 1, key);
    }

    public static void main(String[] args) {
        // System.out.println(7/3);
        int arr[] = { 3, 4, 5, 6, 1, 2 };
        int n = arr.length;
        int k = 0;
        System.out.println(pivotbinarysearch(arr, n, k));
    }
}
