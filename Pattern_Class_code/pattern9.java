import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i, j, n = sc.nextInt();

            for(i=1; i<=n; i++){
                //spaces
                for(j=1; j<=i-1; j++){
                    System.out.print("    ");
                }
                for(j=1; j<=n-i+1; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(i=n-1; i>=1; i--){
                //spaces
                for(j=1; j<=i-1; j++){
                    System.out.print("    ");
                }
                for(j=1; j<=n-i+1; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
