
/*Write a program to find the first repeating element in an array. */
import java.util.*;

public class Array25 {
    public static void RepeatingElem(int[] arr) {
        int[] freq = new int[10];
        for (int idx = 0; idx < arr.length; idx++) {
            freq[arr[idx]]++;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            if (freq[arr[idx]] > 1) {
                System.out.print(arr[idx] + " ");
                return;
            }
        }
        System.out.println("No repeating element found");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 1; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        RepeatingElem(arr);
    }
}
