import java.util.Scanner;

public class patter2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, j, n = sc.nextInt();

            // column symmetric
            System.out.println("Column Symmetric");
            for (i = 0; i <= n; i++) {
                for (j = 0; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }

                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }

                for (j = 0; j <= n - i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }

            // column asymmetric
            System.out.println("Column Asymmetric");
            for (i = 0; i <= n; i++) {
                for (j = 0; j <= n-i; j++) {
                    System.out.print(" ");
                }

                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }

                for (j = 0; j <= i-1; j++) {
                    System.out.print("*");
                }

                for (j = 0; j <= n-i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }

        }
    }

}
