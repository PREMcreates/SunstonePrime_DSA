import java.util.*;
public class ReplaceZeros {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k, rev = 0;
		//logic to check zeros and reversing the number
		while(n!=0){
			k = n%10;
			if(k==0){
				k = 5;
			}
			rev = rev*10+k;
			n = n/10;
		}
		//again reversing the updated number containing 5 on zeros. 
		int ans = 0;
		while(rev!=0){
			int p = rev%10;
			ans = ans*10+p;
			rev = rev/10;
		}
		System.out.println(ans);

    }
}