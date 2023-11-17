// Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..
import java.util.*;;
public class RearrangeSmalLargeSmal {
    static void rearrange(int arr[],int n){
        int k=0;
        Arrays.sort(arr);
        int temp[]=new int[n];
        int i=0;
        int j=n-1;
        for(int l=0;l<=n/2;l++){
            if(k<n){
                temp[k]=arr[i++];
                k++;
            }
            if(k<n){
                temp[k]=arr[j--];
                k++;
            }
        }
        
        for(int i1=0;i1<n;i1++){
            System.out.print(temp[i1]+" ");
        }
    }
    public static void main(String[] cjdn){
        int arr[]={ 8, 1, 4, 2, 9, 3, 7, 6 };
        int n=arr.length;
        rearrange(arr, n);
    }
}
