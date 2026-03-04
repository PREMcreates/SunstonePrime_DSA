import java.util.*;
public class Squareof_Array {
    static int[] SquareofArray(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = arr[i]*arr[i];
        }
        
        Arrays.sort(ans);
        for(int i=0; i<arr.length; i++){
            System.out.println(ans[i]);
        }
        return ans;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(SquareofArray(arr));
    }
}