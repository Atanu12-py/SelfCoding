public class Rec4ReverseString {
    public static String reverseString(String s){
        char str[]=s.toCharArray();
        reverse(str, 0, str.length-1);
        return String.valueOf(str);
    }
    public static void reverse(char s[],int i,int j){
        if(i>j){
            return;
        }
        char ch=s[i];
        s[i]=s[j];
        s[j]=ch;
        reverse(s, i+1, j-1);
    }
    public static void main(String[] args) {
        String s="abcde";
        System.out.println(reverseString(s));
    }
}
