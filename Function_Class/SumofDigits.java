import java.util.Scanner;
public class SumofDigits {
    static int digitsum(int n){
        int rev=0, div= 0;
        
        while(n!=0){
            div = n%10;
            rev = rev + div;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = digitsum(n);
        System.out.println(x+" by created function");
        System.out.println(Math.abs(x)+" by absolute method");
    }
}
