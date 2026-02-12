import java.util.*;
public class RemoveDuplicates {
    static int removeDuplicate(int [] nums){
        int k =1;
        if(nums.length == 0){
            return 0;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[10];

        //insert array elements in acsending order
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("value of k : "+ removeDuplicate(nums));
       
        sc.close();
    }
}
