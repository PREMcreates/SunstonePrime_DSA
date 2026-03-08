import java.util.*;
public class CyclicArraySum {
    public static void main(String args[]) {
		long MOD = 1000000007;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int Q = sc.nextInt();
		
		//logic
		for(int i=0; i<Q; i++){
			int x = sc.nextInt();
			long[] ans = new long[n];
			for(int j=0; j<arr.length; j++){
				int idx = (j - x + n) % n;
				ans[j] = (arr[j] + arr[idx]) % MOD;
			}
			arr = ans;
		}
		long sum = 0;
		for(int i=0; i<arr.length; i++){
			sum = (sum + arr[i]) % MOD;
		}
		System.out.println(sum);

    }
}

