public class Rec6QuickSort {
    public static int partition(int arr[], int s, int e) {
        int pivot = arr[s];
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = s + count;
        int temp = arr[s];
        arr[s] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    public static void quickSort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int pivotInd = partition(arr, s, e);
        quickSort(arr, s, pivotInd - 1);
        quickSort(arr, pivotInd + 1, e);
    }

    public static void main(String[] args) {
        int arr[] = {5,5,5,6,7,0,6, 2, 21, 8, 6, 1 };
        int n=arr.length-1;
        quickSort(arr, 0, n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
