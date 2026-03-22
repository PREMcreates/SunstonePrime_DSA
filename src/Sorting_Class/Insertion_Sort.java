import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // input
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // insertion sort
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // output
        System.out.println("\nAfter Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
