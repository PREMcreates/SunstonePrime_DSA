import java.util.*;
public record CountDigit() {
    static int countdigit(int n, int digit){
        int ans = 0;
        //logic to count digit
        while(n!=0){
            int p = n%10;
            if(p == digit){
                ans++;
            }
            n = n/10;
        }
        return ans;
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //main number n.
    int digit = sc.nextInt(); //to be counted in n.

    System.out.println(countdigit(n, digit));

    }
}
