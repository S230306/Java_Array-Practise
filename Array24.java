
/*Write a program to split an array into two arrays of equal size in Java. */
import java.util.*;

public class Array24 {
    public static void SplitAnArray(int[] arr, int n) {
        if (n % 2 == 0) {
            int[] arr1 = new int[n / 2];
            int[] arr2 = new int[n / 2];
            for (int idx = 0; idx < n / 2; idx++) {
                arr1[idx] = arr[idx];
                arr2[idx] = arr[idx + n / 2];
            }
            for (int idx = 0; idx < arr1.length; idx++) {
                System.out.print(arr1[idx] + " ");
            }
            System.out.println();
            for (int idx = 0; idx < arr2.length; idx++) {
                System.out.print(arr2[idx] + " ");
            }
        } else {
            System.out.print("Can not Split in Equal Part");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        SplitAnArray(arr, n);
    }
}
