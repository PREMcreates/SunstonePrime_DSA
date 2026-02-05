
import java.util.Scanner;

public class TestPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, mid = (n + 1) / 2;

        //upper part
        for (i = 1; i <= mid; i++) {
            //left spaces
            for (j = 1; j <= mid-i; j++) {
                System.out.print("    ");
            }

            //upper left pattern
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            //right spaces
            for (j = 1; j <= 2*i-3; j++) {
                System.out.print("  ");
            }

            //upper right pattern
            if(i!=1){
                 for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            }
            System.out.println();
        }

        //lower part
        for (i = mid-1; i >= 1; i--) {
            //left spaces
            for (j = 1; j <= mid-i; j++) {
                System.out.print("    ");
            }

            //right left pattern
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            //right spaces
            for (j = 1; j <= 2*i-3; j++) {
                System.out.print("  ");
            }

            //lower right pattern
            if(i!=1){
                 for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            }
            System.out.println();
        }    
    }
}
