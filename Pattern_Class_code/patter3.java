import java.util.Scanner;
public class patter3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i, j,  n = sc.nextInt();

            for (i = 1; i <= n; i++) {
                //spaces
                for (j = 1; j <= n-i; j++) {
                    System.out.print("  ");
                }
                //main pattern
                for(j=1; j<=2*i-1; j++){
                    if(j%2==0){
                        //!
                        System.out.print("! ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        } 
    }
}
