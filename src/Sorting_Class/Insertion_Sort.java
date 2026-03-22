import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //input array
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //insertion sort
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(arr[j]>key && j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        

        //printing sorted array
        System.out.println("After Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
