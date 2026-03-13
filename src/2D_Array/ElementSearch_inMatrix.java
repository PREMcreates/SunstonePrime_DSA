import java.util.*;
public class ElementSearch_inMatrix {
    public static int searchMatrix(int[][] matrix, int target) {
        // Write your code here
		for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
					return 1;
				}
            }
        }
		return 0;
    }
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr=new int[n][m];
        for (int i=0; i<n; i++){
               for(int j=0; j<m; j++){
                     arr[i][j]=scn.nextInt();
                }
         }
         int k = scn.nextInt();
        System.out.print(searchMatrix(arr, k));
    }
    
}

