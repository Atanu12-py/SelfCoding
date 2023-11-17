public class Rec5MergeSort {
    public static void merge(int arr[],int s,int e){
        int mid=s+(e-s)/2;
        int len1=mid-s+1;
        int len2=e-mid;
        int arr1[]=new int[len1];
        int arr2[]=new int[len2];

        int k=s;
        for(int i=0;i<len1;i++){
            arr1[i]=arr[k++];
        }
        for(int i=0;i<len2;i++){
            arr2[i]=arr[k++];
        }

        int ind1=0;
        int ind2=0;
        k=s;
        while(ind1<len1 && ind2<len2){
            if(arr1[ind1]<arr2[ind2]){
                arr[k++]=arr1[ind1++];
            }
            else{
                arr[k++]=arr2[ind2++];
            }
        }
        while(ind1<len1){
            arr[k++]=arr1[ind1++];
        }
        while(ind2<len2){
            arr[k++]=arr2[ind2++];
        }

    }
    public static void mergeSort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        merge(arr, s, e);
    }
    public static void main(String[] args) {
        int arr[]={4,2,5};
        mergeSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
