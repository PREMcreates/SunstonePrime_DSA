import java.util.*;
public class Wavearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        //input array a
        System.out.println("Enter elements in a: ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // traversing the array from column
        for(int i=0; i<4; i++){
            if(i%2 == 0){
                for(int j=0; j<4; j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            else{
                for(int j=3; j>=0; j--){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}
