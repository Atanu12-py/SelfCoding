import java.util.*;
public class Rec8PhoneKeypad {
    public static List<String> phone(String s){
        List<String> ans=new ArrayList<>();
        String ss="";
        int ind=0;
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        function(s, ind, ss, arr, ans);
        return ans;

    }
    public static void function(String s,int ind,String ss,String arr[],List<String> ans){
        if(ind>=s.length()){
            ans.add(ss);
            return;
        }
        int count=s.charAt(ind)-'0';
        String output=arr[count];
        for(int i=0;i<output.length();i++){
            ss+=String.valueOf(output.charAt(i));
            function(s, ind+1, ss, arr, ans);
            String temp=ss.substring(0, ss.length()-1);
            ss=temp;
        }
    }
    public static void main(String[] args) {
        String s="234";
        List<String> ans=phone(s);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
}
