import java.util.*;
public class HappyNum_leetcode2 {
    static boolean isHappy(int n){
        int sum;
        if(n==1 || n==7){
            return true;
        }
        else if(n<10){
            return false;
        }
        else{
            sum = 0;
            while(n!=0){
                int ldgt = n%10;
                sum += (ldgt*ldgt);
                n = n/10;
            }
        }
        return isHappy(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }
}
