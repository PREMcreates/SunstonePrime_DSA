import java.util.Scanner;
public class Inversenum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        int i = 1;

        while(n != 0){
            int lastdgt = n % 10;
            ans = ans + i * (int)(Math.pow(10, lastdgt - 1));
            i++;
            n = n / 10;
        }

        System.out.print(ans);
        sc.close();
    }
}
