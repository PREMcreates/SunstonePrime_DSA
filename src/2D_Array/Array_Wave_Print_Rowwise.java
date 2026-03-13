import java.util.*;
public class Array_Wave_Print_Rowwise {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  // row
        int n = sc.nextInt();  // column
        int[][] arr = new int[m][n];

        //taking input of nums of matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //printing output
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
		
    }
}


