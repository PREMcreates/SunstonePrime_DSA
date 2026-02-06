import java.util.Scanner;
public class SwastikBy_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, mid = (n+1)/2;

        //logic using if-else with dividing in matrix.
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++){

                if(i==mid || j==mid || (j==1 && i<=mid) || (i==1 && j>=mid)
                || (i==n && j<=mid) || (i>=mid && j==n)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}