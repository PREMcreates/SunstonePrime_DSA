
import java.util.*;

public class MagicalMatrix {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();  // strength sgould greater than k
        int s = sc.nextInt();  // strength 
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        //logic 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (arr[i][j] == '#') {
                    break;   // next row shift krdega
                }

                if (arr[i][j] == '.') {
                    s -= 2;
                } else if (arr[i][j] == '*') {
                    s += 5;
                }
                // -1 for every step
                if (j != m - 1) {
                    s -= 1;
                }

                if (s <= k) {
                    System.out.println("No");
                    return;
                }
            }
        }

        if (s >= k) {
            System.out.println("Yes");
            System.out.println(s);
        } else {
            System.out.println("No");
        }

    }
}
