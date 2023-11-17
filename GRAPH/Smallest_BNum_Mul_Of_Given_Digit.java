package GRAPH;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Smallest_BNum_Mul_Of_Given_Digit {
    static int mod(String s,int n){
        int r=0;
        for(int i=0;i<s.length();i++){
            r=r*10+(s.charAt(i)-'0');
            r%=n;
        }
        return r;
    }
    static String getminmulString(int n){
        Queue<String> queue=new LinkedList<String>();
        Set<Integer> st=new HashSet<>();
        String t="1";
        queue.add(t);

        while(!queue.isEmpty()){
            t=queue.remove();
            int rem=mod(t, n);
            if(rem==0){
                return t;
            }
            else if(!st.contains(rem)){
                st.add(rem);
                queue.add(t+"0");
                queue.add(t+"1");
            }
        }
        return "";
    }
    public static void main(String[] jeb){
        int n=11;
        System.out.println(getminmulString(n));
    }
}
