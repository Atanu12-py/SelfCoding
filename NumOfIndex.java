// Number of indexes with equal elements in given range

public class NumOfIndex {
    public int answerQuery(int arr[],int n,int l,int r){
        int count=0;
        for(int i=l;i<r;i++){
            if(arr[i]==arr[i+1]){
                count+=1;
            }
        }
        return count;

    }
    public static void main(String[] args){
        int arr[]={1,2,2,2,3,3,4,4,4};
        int n=args.length;
        int l=1;
        int r=8;
        NumOfIndex num=new NumOfIndex();
        System.out.println(num.answerQuery(arr, n, l, r));

        l=0;
        r=4;
        System.out.println(num.answerQuery(arr, n, l, r));
    }
}
