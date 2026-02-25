import java.util.*;
public class Array_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] sum = new int[3][3];

        //input array a
        System.out.println("Enter elements in a: ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        //input array b
        System.out.println("Enter elements in b: ");
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b.length; j++){
                b[i][j] = sc.nextInt();
            }
        }

        //sum in array c of array a and b
        for(int i=0; i<sum.length; i++){
            for(int j=0; j<sum.length; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        //printing sum of a and b
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


    }
}
