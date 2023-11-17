import java.util.*;

public class Rec7SubsequenceOfStr {
    public static List<String> subsequence(String s) {
        List<String> lst=new ArrayList<>();
        String ss="";
        function(s, ss, 0, lst);
        return lst;
    }

    public static void function(String s, String ss, int ind, List<String> ans) {
        if (ind >= s.length()) {
            if(ss.length()>0){
                ans.add(ss);
            }
            return;
        }
        function(s, ss, ind + 1, ans);
        ss += String.valueOf(s.charAt(ind));
        function(s, ss, ind + 1, ans);
    }
    public static void main(String[] args) {
        String s="abc";
        List<String> ans =subsequence(s);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
}
