// *  ****
// *  *
// *  *
// *******
//    *  *
//    *  *
// ****  *

import java.util.Scanner;

public class SwastikTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, mid = (n + 1) / 2;

        //upper part
        for (i = 1; i <= mid; i++) {
            for (j = 1; j <= mid; j++) {
                if (j == 1 || j == mid || i == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (j = 1; j <= mid - 1; j++) {
                if (i == 1 || i == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //lower part
        for (i = 1; i <= mid - 1; i++) {
            for (j = 1; j <= mid; j++) {
                if (i == mid-1 || j == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (j = 1; j <= mid-1; j++) {
                if (j == mid-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }

    }
}
