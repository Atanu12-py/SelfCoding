
// Positive elements at even and negative at odd positions (Relative order not maintained)

public class EvenPosOddNeg {
   static void rarrange(int arr[],int n){
    int p=0;
    int neg=1;
    int temp;
    while(true){
        while(p<n && arr[p]>=0){
            p+=2;
        }
        while(neg<n && arr[neg]<=0){
            neg+=2;
        }
        if(p<n && neg<n){
            temp=arr[p];
            arr[p]=arr[neg];
            arr[neg]=temp;
        }
        else{
            break;
        }
    }
   }
    public static void main(String[] args) {
        int arr[] = { 1, -2, -3, 4, 5, 6, - 8 };
        int n = arr.length;
        rarrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
