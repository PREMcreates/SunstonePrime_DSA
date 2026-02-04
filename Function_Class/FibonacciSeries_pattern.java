import java.util.Scanner;
public class FibonacciSeries_pattern {
    static int fibo(int g){
        //base case
        if(g==0 || g==1){
            return g;
        }
        //recursion
        return fibo(g-1)+fibo(g-2); // it is giving the series number after giving the index number.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 0;

         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(fibo(g)+" ");
                g++;
            }
            System.out.println();  
        }
    }
}
