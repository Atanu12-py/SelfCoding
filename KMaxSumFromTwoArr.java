import java.util.*;

public class KMaxSumFromTwoArr{
    static void kMaxSum(int arr1[],int arr2[],int n,int k){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int l=n-1;
        if(arr1[n-1]>=arr2[n-1]){
            for(int i=0;i<k;i++){
                System.out.println(arr1[n-1]+arr2[l--]);
            }
        }
        else{
            for(int j=0;j<k;j++){
                System.out.println(arr2[n-1]+arr1[l--]);
            }
        }
        
    }
    public static void main(String[] jbd){
        // int arr1[]={1,3,3,4};
        // int arr1[]={4,2,5,1};
        int arr1[]={3,2};
        // int arr2[]={5,6,7,8};
        // int arr2[]={8,0,3,5};
        int arr2[]={1,4};
        int n=arr1.length;
        int k=2;
        kMaxSum(arr1, arr2, n, k);

    }
}