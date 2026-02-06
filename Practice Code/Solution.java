import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        int temp = x;
        if(x<0){
            return false;
        }
        int rev = 0;
        while (x != 0) {
            int div = x % 10;
            rev = rev * 10 + div;
            x = x / 10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}