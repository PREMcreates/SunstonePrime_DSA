import java.util.*;

public class EvenOddinDelhi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int carnum;
        for (int i = 1; i <= n; i++) {
            carnum = sc.nextInt();
            int oddsum = 0;
            int evensum = 0;
            while (carnum != 0) {
                int k = carnum % 10;
                if (k % 2 == 0) {
                    evensum += k;
                } else {
                    oddsum += k;
                }
                carnum = carnum / 10;
            }
            if (evensum % 4 == 0 || oddsum % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
