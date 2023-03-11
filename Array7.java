/*Write a Java program to find the average of all the elements of an array. */
import java.util.*;
public class Array7 {
    public static int averageFind(int[]arr){
        int sum = 0;
        for(int idx=0;idx<arr.length;idx++){sum+=arr[idx];}
        // find the Average.
        int average = sum/arr.length;
        return average;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.print(averageFind(arr));
    }
}
