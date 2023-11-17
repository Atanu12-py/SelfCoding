package Algo;
// class LinearSearch {
//     static int search(int[] arr,int n,int key){
//         for(int i=0;i<n;i++){
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] jhd){
//         int arr[]={1,2,3,4,5,6,7,8};
//         int n=arr.length;
//         int key=5;
//         System.out.println(search(arr, n, key));
//     }
// }

//Recursive approach

class LinearSearch{
    static int search(int arr[],int n,int key){
        if(n==0){
            return -1;
        }
        else if(arr[n-1]==key){
            return n-1;
        }
        else{
            int ans=search(arr, n-1, key);
            return ans;
        }
    }
    public static void main(String[] jsj){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int key=5;
        System.out.println(search(arr, n, key));
    }
}
