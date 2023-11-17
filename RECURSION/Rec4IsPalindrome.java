public class Rec4IsPalindrome {
    public static boolean palin(String s,int i){
        if(i>s.length()-i-1){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        else{
            return palin(s, i+1);
        }
    }
    public static void main(String[] args) {
        String s="abcba";
        System.out.println(palin(s, 0));
    }
}
