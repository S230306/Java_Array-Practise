/*Write a Java program to sort an array in ascending order using the bubble sort algorithm.*/
import java.util.*;
public class Array6 {
    public static void sortArray(int[]arr,int n){
        for(int idx=0;idx<n-1;idx++){
            for(int jdx=0;jdx<n-idx-1;jdx++){
                if(arr[jdx]>arr[jdx+1]){
                    int temp = arr[jdx];
                    arr[jdx]=arr[jdx+1];
                    arr[jdx+1]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=scn.nextInt();
        }
        sortArray(arr,n);
        for(int x:arr){System.out.print(x+" ");}
    }
}
