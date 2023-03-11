
/*Write a program to find the second smallest element in an array in Java. */
import java.util.*;

public class Array21 {
    public static int SecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] < smallest) {
                secondSmallest = smallest;
                smallest = arr[idx];
            } else if (arr[idx] < secondSmallest && arr[idx] != smallest) {
                secondSmallest = arr[idx];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        System.out.print(SecondSmallest(arr));
    }
}
