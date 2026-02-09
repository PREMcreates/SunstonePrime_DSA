
import java.util.*;

public class PrintSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int n = 1;
        //logic for series
        while (N1 != 0) {
            int series = 3 * n + 2;
            if ((series % N2) != 0) {
                System.out.println(series);
                N1--;
            }
            n++;
        }
    }
}
