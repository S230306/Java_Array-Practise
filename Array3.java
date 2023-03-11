/*Write a Java program to find the largest and smallest number in an array. */
import java.util.*;
public class Array3 {
    public static void findMinMaxNum(int[]arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int x:arr){
            if(x>largest)largest=x;if(x<smallest)smallest=x;}
            System.out.println(largest+" "+smallest);
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=scn.nextInt();
        }
        findMinMaxNum(arr);
    }
}
