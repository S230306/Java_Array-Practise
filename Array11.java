/*Write a Java program to find the common elements between two arrays. */
import java.util.*;
public class Array11 {
    public static void printCommonElem(int[]arr,int[]arr1){
        for(int idx=0;idx<arr.length;idx++){
            for(int jdx=0;jdx<arr1.length;jdx++){
                if(arr[idx]==arr1[jdx]){System.out.print(arr[idx]+" ");}
            }
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[]arr1 = new int[m];
        for(int idx=0;idx<arr1.length;idx++){
            arr1[idx] = scn.nextInt();
        }
        printCommonElem(arr,arr1);
    }  
}
