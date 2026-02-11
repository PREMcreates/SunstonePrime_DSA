import java.util.*;
public class kthFactor {
    public static int kthFactor(int n, int k) {
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                cnt++;
                if(cnt==k){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(kthFactor(n,k));
    }
}
