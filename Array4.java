/*Write a Java program to remove duplicates from an array. */
import java.util.*;
public class Array4 {
    public static void removeDubli(int[]arr){
        System.out.print(arr[0]+" ");
        for(int idx=1;idx<arr.length;idx++){
            if(arr[idx]==arr[idx-1])continue;
            else System.out.print(arr[idx]+" ");
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=scn.nextInt();
        }
        removeDubli(arr);
    }
}
