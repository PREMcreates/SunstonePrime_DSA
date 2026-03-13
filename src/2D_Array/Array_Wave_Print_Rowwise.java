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
        //logic to print
        for(int i=0; i<m; i++){
            if(i%2 == 0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+",");
                }
            }
            else{
                for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j]+",");
                }
            }
        }
        System.out.print("END");
		
    }
}


