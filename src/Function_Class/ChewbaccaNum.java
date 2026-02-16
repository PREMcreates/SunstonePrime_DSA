import java.util.*;
public class ChewbaccaNum {
    static int chewbacca(int x){
        int ans = 0;
        int temp = x;
        int rev = 1;
        int ldgt = 0;
        //counting digits
        while(temp!=0){
            ldgt++;
            temp = temp/10;
        }
        while(x!=0){
            int k = x%10;
            int minus = 9-k;
            if(ldgt == 1){
                rev = rev*10+ k;
                x = x/10;
            } 
            else if(minus<k){
                rev = rev*10+minus;
                ldgt--;
            }
            else{
                rev = rev*10 + k;
                ldgt--;
            }
            x = x/10;
        }
        //reversing the digit
        while(rev!=0){
            int p = rev%10;
            ans = ans*10+p;
            rev = rev/10;
        }
        return ans/10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(chewbacca(x));
    }
}
