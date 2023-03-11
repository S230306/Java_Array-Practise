/*Write a Java program to rotate an integer array by a given number of positions. */
import java.util.*;
public class Array16 {
    public static void rotateArray(int[]arr,int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
   public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];
    for(int idx=0;idx<arr.length;idx++){
        arr[idx] = scn.nextInt();
    }
    int  k = scn.nextInt();
    rotateArray(arr,0,n-k-1);
    rotateArray(arr,n-k,n-1);
    rotateArray(arr,0,n-1);
    for(int idx=0;idx<arr.length;idx++){
        System.out.print(arr[idx]+" ");
    }
   } 
}
