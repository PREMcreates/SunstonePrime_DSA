package Leetcode;
import java.util.*;

public class MedianofSortedArrays {
    public static List<Integer> mergeArrays(int[] arr1, int[] arr2){
        int i=0, j=0;
        int m = arr1.length;
        int n = arr2.length;
        List<Integer> list = new ArrayList<>();

        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
                list.add(arr1[i]);
                i++;
            }
            else{
                list.add(arr2[j]);
                j++;
            }
        }
        while(i < m){
            list.add(arr1[i]);
            i++;
        }
        while(j < n){
            list.add(arr2[j]);
            j++;
        }
        return list;

    }
    public static double findMedianSortedArrays(int[] arr1, int[] arr2){
        List<Integer> arr3 = mergeArrays(arr1, arr2);
        int size = arr3.size();

        if(size % 2 != 0){
            int mid = size/2;
            
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();  // size of first array
        int n2 = sc.nextInt();  // size of econd array
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        //input array1
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        //input array2
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
