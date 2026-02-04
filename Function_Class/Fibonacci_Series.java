import java.util.Scanner;
public class Fibonacci_Series {
    static int fibo(int n){
        //base case
        if(n==1 || n==0){
            return n;
        }
        //recursion
        return fibo(n-1)+fibo(n-2); // it is giving the series number after giving the index number.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 0;

        for(int i=0; i<n; i++){
            System.out.print(fibo(i)+" ");
        }
        int x = fibo(n);
        System.out.println();
        System.out.print(x);
    }
}
