import java.util.*;
public class RotateArray {
    
    static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[] a = new int[n*n];
        int k=0; 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
               a[k] = matrix[i][j];
               k++;
            }
        }
        k=0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
               matrix[j][i] = a[k];
               k++;
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            int j = 0;
            k = matrix.length - 1;
            while(j < k) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;

                j++;
                k--;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        rotate(arr);
    }

}
