import java.util.Scanner;
public class DecimalToBinary {
    static int rev(int n){
        int rev =0;
        int div =0;
        while(n!=0){
            div = n%10;
            rev = rev*10 + div;
            n= n/2;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bn = 1;
        while(n>0){
            int m = n % 2;
            bn = bn*10 + m;
            n = n/2;
        }
        int x = (rev(bn)/10);
        System.out.println(x);
    }
}
