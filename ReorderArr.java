// Reorder an array according to given indexes

public class ReorderArr {
    static void reorder(int arr[],int index[],int n){
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[index[i]]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
            index[i]=i;
        }
    }
    public static void main(String[] jbd){
        int arr[]={50, 40, 70, 60, 90};
        int index[]={3,  0,  4,  1,  2};
        int n=arr.length;
        reorder(arr, index, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(index[i]+" ");
        }
    }
}
