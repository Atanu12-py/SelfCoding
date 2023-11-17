import java.util.*;

public class Rec9PermutationOfArr {
    public static ArrayList<ArrayList<Integer>> permutation(int arr[]){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int index=0;
        function(arr, index, ans);
        return ans;


    }
    public static void function(int arr[],int index,ArrayList<ArrayList<Integer>> ans){
        if(index>=arr.length){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                temp.add(arr[i]);
            }
            ans.add(temp);
            return;
        }

        for(int j=index;j<arr.length;j++){
            int temp=arr[j];
            arr[j]=arr[index];
            arr[index]=temp;
            function(arr, index+1, ans);

            int temp1=arr[j];
            arr[j]=arr[index];
            arr[index]=temp1;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> ans=permutation(arr);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
