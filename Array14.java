/*Write a Java program to find the index of a specific element in an integer array. */
import java.util.*;
public class Array14 {
    public static int findIndex(int[]arr,int target){
        for(int idx=0;idx<arr.length;idx++){
            if(arr[idx]==target){
                return idx;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx] = scn.nextInt();
        }
        int specificElem = scn.nextInt();
        System.out.print(findIndex(arr,specificElem));
    }
}
