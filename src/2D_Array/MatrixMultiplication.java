import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] result = new int[m][n];

        //input for matrix a
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        //input for matrix b
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        //multiplication of both matrix a and b
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                result[i][j] = a[i][j] * b[i][j]; 
            }
        }
        //printing the result
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
