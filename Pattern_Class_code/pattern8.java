import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i, j;

            for (i = n; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                //inner spaces
                for(j=1; j<=(2*(n-i))-1; j++){
                    System.out.print("  ");
                }
                for(j=1; j<=i && j!=n; j++){
                    System.out.print("* ");
                }
                System.out.println();
            } 
        }
    }
}
