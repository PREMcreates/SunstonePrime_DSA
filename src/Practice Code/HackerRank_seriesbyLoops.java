
import java.util.Scanner;

public class HackerRank_seriesbyLoops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //taking all inputs
        int q = sc.nextInt();
        int a, b, n = 0;
        for (int i = 1; i <= q; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();

            //printing series
            int g =0;
            int s = a + b*(int)(Math.pow(2,g));
            for (int j = 1; j <= n; j++) {
                System.out.print(s+" ");
                g++;
                s = s + (int)(b*Math.pow(2,g));
            }
        }

    }
}
