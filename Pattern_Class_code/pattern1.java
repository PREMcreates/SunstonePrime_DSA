import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            //row symmetric 
            System.out.println("Row Symmetric");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }

            //row asymmetric
            System.out.println("Row Asymmetric");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
