import java.util.Scanner;
public class patter3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i, j,  n = sc.nextInt();

            for (i = 0; i <= n; i++) {
                for (j = 0; j <= n-i; j++) {
                    System.out.print(" ");
                }

                for (j = 0; j <= i; j++) {
                    
                    if(j%2 == 0){
                        System.out.print("*");
                    }
                    if(j%2 != 0){
                        System.out.print("!");
                    }
                }

                for (j = 0; j <= i-1; j++) {
                    
                    if(j%2 != 0){
                        System.out.print("*");
                    }
                    if(j%2 != 0){
                        System.out.print("!");
                    }
                }

                for (j = 0; j <= n-i; j++) {
                    System.out.print("");
                }
                System.out.println();
            }
        }
    }
}
