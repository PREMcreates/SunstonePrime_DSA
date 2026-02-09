import java.util.*;

public class array {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        // taking input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
