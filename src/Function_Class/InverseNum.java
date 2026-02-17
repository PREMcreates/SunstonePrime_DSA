// import java.util.ArrayList;
import java.util.*;
public class InverseNum {
    static void inversenum(int n){
        int temp = n;
        int dgt = 0;
        //counting digits
        while(n!=0){
            dgt++;
            n = n/10;
        }
        int [] ans = new int[dgt];
        int i = 0;
        while(temp!=0){
            int l = temp%10;
            ans[l-1] = i+1;
            i++;
            temp = temp/10;
        }
        for(i=dgt-1; i>=0; i--){
            System.out.print(ans[i]);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inversenum(n);
    }
}
