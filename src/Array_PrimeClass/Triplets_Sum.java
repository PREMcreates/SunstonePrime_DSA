import java.util.*;
public class Triplets_Sum {
	static void Triplets(int[] arr, int target){
			int n = arr.length;
		for(int i=0; i<n-2; i++){
			int left = i+1; 
			int right = n-1;

			while(left < right){
				int sum = arr[i] + arr[left] + arr[right];

				if(sum == target){
					System.out.println(arr[i]+" "+arr[left]+" "+"and "+arr[right]);
					left++;
					right--;

					//skip duplicates
					while(left < right && arr[left] == arr[left-1])
                        left++;

                    while(left < right && arr[right] == arr[right+1])
                        right--;
				}
				else if(sum < target){
					left++;
				}
				else{
					right--;
				}
			}
		}
	    }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // size of array
		int[] arr = new int[n];  // array of size n
		//input of elements
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();   // target input for triplets

		Arrays.sort(arr);
		Triplets(arr, target);

    }
}