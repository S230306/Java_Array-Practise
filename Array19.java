
/*Write a program to remove an element from an array of integers. */
import java.util.*;

public class Array19 {
    public static void removeElement(int[] arr, int k) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == k) {
                continue;
            }
            System.out.print(arr[idx] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        int removalElem = scn.nextInt();
        removeElement(arr, removalElem);
    }
}
