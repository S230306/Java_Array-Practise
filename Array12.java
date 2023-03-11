/*Write a Java program to sort an array in descending order.*/
import java.util.*;
public class Array12 {
    public static void sortDecendingOrder(int[]arr,int n){
        for(int idx=0;idx<n-1;idx++){
            for(int jdx=0;jdx<n-idx-1;jdx++){
                // for sort in accending order
                // if(arr[jdx]>arr[jdx+1]){
                //     int temp=arr[jdx];
                //     arr[jdx]=arr[jdx+1];
                //     arr[jdx+1]=temp;

                // }
                // sort in decending order.
                 if(arr[jdx+1]>arr[jdx]){
                    int temp=arr[jdx+1];
                    arr[jdx+1]=arr[jdx];
                    arr[jdx]=temp;

                }
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
        sortDecendingOrder(arr,n);
        for(int x:arr){System.out.print(x+" ");}
    }
}
