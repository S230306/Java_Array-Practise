/*Write a Java program to reverse an array. */
import java.util.*;
public class Array5 {
    public static void reverseArray(int[]arr){
        int left=0,right=arr.length-1;
        while(left<right){
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=scn.nextInt();
        }
        reverseArray(arr);
        for(int x:arr){System.out.print(x+" ");}
    }
}
