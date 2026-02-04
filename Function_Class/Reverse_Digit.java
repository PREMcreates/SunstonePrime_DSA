import java.util.Scanner;
public class Reverse_Digit {
    static int reversedigit(int n){
        int rev=0, div= 0;
        
        while(n!=0){
            div = n%10;
            rev = rev *10 + div;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = reversedigit(n);
        System.out.println(x);

    }
}
