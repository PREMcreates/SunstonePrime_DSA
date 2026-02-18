
import java.util.Scanner;

public class HappyNumber_Leetcode {

    public static boolean isHappy(int n) {
        int sum = 0;
        int temp;
        if(n==1){
            return true;
        }
        else{
            while (n != 1 && n!=4) {
            sum = 0;
            temp = n;
            while (temp != 0) {
                int ldgt = temp % 10;
                sum = sum + (ldgt * ldgt);
                temp = temp / 10;
            }
            n = sum;
            }
        }

        if (sum == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }
}
