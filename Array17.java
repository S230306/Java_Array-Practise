/*Write a program to find the maximum sum of any contiguous 
subarray of an array of integers (using Kadane's algorithm)*/
import java.util.*;
public class Array17 {
    public static void maxSum(int[]arr){
        int sum = 0, maxSum=Integer.MIN_VALUE;
        for(int idx=0;idx<arr.length;idx++){
            sum=Math.max(sum+arr[idx],arr[idx]);
            maxSum=Math.max(sum,maxSum);
        }
        System.out.print(maxSum);
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx] = scn.nextInt();
        }
        maxSum(arr);
    }
}
