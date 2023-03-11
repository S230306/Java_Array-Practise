
/*write the java pogram to find out the Union */
import java.util.HashSet;
import java.util.*;
import java.lang.*;

public class Array23 {
    public static void UnionOfArray(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr1) {
            set.add(x);
        }
        for (int x : arr2) {
            set.add(x);
        }
        for (int x : set) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int idx = 0; idx < arr1.length; idx++) {
            arr1[idx] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int idx = 0; idx < arr2.length; idx++) {
            arr2[idx] = scn.nextInt();
        }
        UnionOfArray(arr1, arr2);
    }
}
