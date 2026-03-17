import java.util.*;
public class Column_Sum {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //logic
        int sum = 0, ans = 0, index = 0;
        int i, j;
        for(j=0; j<n; j++){
            sum = 0;
            for(i=0; i<n; i++){
                sum = sum + arr[i][j];
            }
            if(sum > ans){
                ans = sum;
                index = j;
            }
        }
        System.out.println((index+1)+" "+ans);
        
    }
}