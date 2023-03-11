/*Write a Java program to find the missing number in an array of integers from 1 to n. */
import java.util.*;
public class Array10 {
    public static void printMissingNum(int[]arr,int n){
        // find the sum of number
        int sumOfNum = n*((n+1)/2);
        // noe calculating the sum of array.
        int sumArray = 0;
        for(int idx=0;idx<arr.length;idx++){sumArray+=arr[idx];}
        int missingNum = sumOfNum-sumArray;
        System.out.print(missingNum);
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n-1];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=scn.nextInt();
        }
        printMissingNum(arr,n);
    }
}
