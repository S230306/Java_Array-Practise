
/*Write a program that accepts an array of integers 
as input and returns the sum of all even numbers in the array.*/
import java.util.*;

public class Array20 {
    public static int PrintEvenSum(int[] arr) {
        int sum = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] % 2 == 0) {
                sum += arr[idx];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        System.out.print(PrintEvenSum(arr));
    }
}
