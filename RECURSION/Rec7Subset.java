import java.util.ArrayList;
import java.util.List;

public class Rec7Subset {
    public static List<List<Integer>> subset(int arr[]) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        function(arr, 0, ans, lst);
        return ans;
    }

    public static void function(int arr[], int ind, List<List<Integer>> ans, List<Integer> lst) {
        if (ind >= arr.length) {
            ans.add(lst);
            return;
        }
        function(arr, ind + 1, ans, new ArrayList<>(lst));

        lst.add(arr[ind]);
        function(arr, ind + 1, ans, lst);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans=subset(arr);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }
}
