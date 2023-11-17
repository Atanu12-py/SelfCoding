// import java.util.Arrays;

public class RearrangeMaxMinMax {

    static void maxMinMax(int[] arr, int n) {
        int temp[] = arr.clone();
        int small = 0, large = n - 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                arr[i] = temp[large--];
            } else {
                arr[i] = temp[small++];
            }
            flag = !flag;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] sjh){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        maxMinMax(arr, n);
    }
}