public class PowerOf2 {
    public static int power(int n){
        if(n==0){
            return 1;
    }
        int sp=power(n-1);
        int bp=2*sp;
        return bp;
    }
    public static void main(String[] args) {
        System.out.println(power(10));
    }
}
