
import java.util.*;

public class Leetcode_findPivotIndex {

    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightsum = total - leftsum - nums[i];
            if (rightsum == leftsum) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int asize = sc.nextInt();
        int[] nums = new int[asize];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int x = pivotIndex(nums);
        System.out.println(x);

    }
}
