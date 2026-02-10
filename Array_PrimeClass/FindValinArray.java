import java.util.*;
public class FindValinArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int pos = -1;
        //enter values in array
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();

        //enter element to find
        int ele = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ele){
                pos = i+1;
                break;
            }
        }
        if(pos<0){
            System.out.println("Element is not present in array");
        }
        else{
            System.out.println("Element is at : "+pos);
        }

    }
}