/*Write a Java program to check whether an integer array is palindrome or not. */
import java.util.*;
public class Array15 {
    public static void checkPallindrome(int[]arr){
        for(int idx=0;idx<arr.length/2;idx++){
            // if(arr[idx]!=arr[arr.length-idx-1]){
            //     System.out.print("The Given Array is not Pallindrome");
            //     return;
            // }else{
            //     System.out.print("The Given Array is Pallindrome");
            //     return;
            // }
            System.out.print((arr[idx]!=arr[arr.length-idx-1])?
            "The Given Array is not Pallindrome"
            :"The Given Array is Pallindrome");
            return;
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
        arr[idx] = scn.nextInt();
      }
      checkPallindrome(arr);
    }
}
