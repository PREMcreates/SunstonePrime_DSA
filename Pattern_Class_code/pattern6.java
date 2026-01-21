import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, j, m;
            m = sc.nextInt();
            int n = (m+1)/2;

            for(i=1; i<=n; i++){
                //outer space
                for(j=1; j<=n-i; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                //inner space
                for(j=1; j<=2*i-3; j++){
                    System.out.print("  ");
                }
                if(i!=1){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(i=n-1; i>=1; i--){
                //outer space
                for(j=1; j<=n-i; j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                //inner space
                for(j=1; j<=2*i-3; j++){
                    System.out.print("  ");
                }
                if(i!=1){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
