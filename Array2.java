/*Write a Java program to find the sum of all the elements in an array. */
import java.util.*;
public class Array2 {
   public static int sumElemOfArray(int[]arr){
    int sum=0;
    for(int x:arr){sum+=x;}
    return sum;
   }
   public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr=new int[n];
    for(int idx=0;idx<arr.length;idx++){
        arr[idx]=scn.nextInt();
    }
    System.out.print(sumElemOfArray(arr));
   } 
}
