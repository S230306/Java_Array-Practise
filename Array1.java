/*Write a Java program to find the second largest number in an array. */
import java.util.*;
public class Array1{
    public static void secondLargestElem(int[]arr){
        int largest = Integer.MIN_VALUE;
        int secondLarg = Integer.MIN_VALUE;
        //Iterate on over the Array
        for(int x:arr){
            if(x>largest){secondLarg=largest;largest=x;}
        }
        System.out.println(secondLarg);
    }
    public static void main(String[]args){
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int[]arr = new int[n];
     for(int idx=0;idx<arr.length;idx++){
        arr[idx]=scn.nextInt();
     }
     secondLargestElem(arr);
    }
}