import java.util.*;
public class Triplets_Sum {
	static void Triplets(int[] arr, int target){
			for(int i=0; i<arr.length; i++){
				for(int j=i+1; j<arr.length; j++){
					for(int k=j+1; k<arr.length; k++){
						if(arr[i]+arr[j]+arr[k] == target){
							System.out.println(i+" "+j+" "+"and "+k);
						}
					}
				}
			}
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of array
		int[] arr = new int[n];  // array of size n
		int target = sc.nextInt();   // target input for triplets

		Triplets(arr, target);

    }
}