import java.util.*;
public class Leetcode_ProductArrayExceptItself {
    static void ProductExceptself(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int prefix = 1;
        // from left
        for(int i=0; i<arr.length; i++){
            left[i] = prefix;
            prefix = prefix*arr[i];
        }
        //from right
        int suffix = 1;
        for(int i=arr.length-1; i>=0; i--){
            right[i] = suffix;
            suffix = suffix*arr[i];
        }
        //creating final array
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = left[i]*right[i];
        }
        //printing output
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int asize = sc.nextInt();
        int[] arr = new int[asize];
        //getting input
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //calling array
        ProductExceptself(arr);
    }
}
