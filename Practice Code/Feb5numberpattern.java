import java.util.Scanner;

public class Feb5numberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, mid = (n+1)/2;

        //upper part logic
        for(i=1; i<=mid; i++){
            //left spaces
            for(j=1; j<=mid-i; j++){
                System.out.print("    ");
            }
            //left pattern
            for(j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            //middle space
            for(j=1; j<=2*i-3; j++){
                System.out.print("  ");
            }
            //right patter
            for(j=1; j<=i; j++){
                if(i!=1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

        //lower part logic
        for(i=mid-1; i>=1; i--){
            //left spaces
            for(j=1; j<=mid-i; j++){
                System.out.print("    ");
            }
            //left pattern
            for(j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            //middle space
            for(j=1; j<=2*i-3; j++){
                System.out.print("  ");
            }
            //right pattern
            for(j=1; j<=i; j++){
                if(i!=1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
