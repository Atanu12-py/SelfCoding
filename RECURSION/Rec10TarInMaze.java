import java.util.ArrayList;

public class Rec10TarInMaze {
    public static ArrayList<String> rat(int arr[][], int n) {
        ArrayList<String> ans = new ArrayList<>();

        String s = "";
        int visited[][] = new int[n][n];
        int x = 0;
        int y = 0;
        function(arr, n, visited, x, y, s, ans);
        return ans;

    }

    public static void function(int arr[][], int n, int visited[][], int x, int y, String s, ArrayList<String> ans) {
        if ((x == n - 1) && (y == n - 1)) {
            ans.add(s);
            return;
        }
        visited[x][y] = 1;
        int newx = x + 1;
        int newy = y;
        if (isSafe(visited, newx, newy, n, arr)) {
            s += "D";
            function(arr, n, visited, newx, newy, s, ans);
            String ss = s.substring(0, s.length() - 1);
            s = ss;
        }

        newx = x - 1;
        newy = y;
        if (isSafe(visited, newx, newy, n, arr)) {
            s += "U";
            function(arr, n, visited, newx, newy, s, ans);
            String ss = s.substring(0, s.length() - 1);
            s = ss;
        }

        newx = x;
        newy = y - 1;
        if (isSafe(visited, newx, newy, n, arr)) {
            s += "L";
            function(arr, n, visited, newx, newy, s, ans);
            String ss = s.substring(0, s.length() - 1);
            s = ss;
        }

        newx = x;
        newy = y + 1;
        if (isSafe(visited, newx, newy,n, arr)) {
            s += "R";
            function(arr, n, visited, newx, newy, s, ans);
            String ss = s.substring(0, s.length() - 1);
            s = ss;
        }
        visited[x][y]=0;
    }

    public static boolean isSafe(int visited[][], int x, int y, int n, int arr[][]) {
        if ((x >= 0 && x < n) && (y >= 0 && y < n) && (arr[x][y] == 1) && (visited[x][y] == 0)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int n=arr.length;
        ArrayList<String> ans=rat(arr, n);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
