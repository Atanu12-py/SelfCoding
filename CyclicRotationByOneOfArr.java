import java.util.Arrays;
public class CyclicRotationByOneOfArr {
    static int[] arr=new int[]{1,2,3,4,5};
    static void rotate(){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(arr));
        rotate();
        System.out.print(Arrays.toString(arr));
    }
}
