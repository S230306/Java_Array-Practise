/*Write a Java program to merge two arrays. */
import java.util.*;
public class Array13 {
    public static int[] mergeArray(int[]arr1,int[]arr2){
        int[]merge = new int[arr1.length+arr2.length];
        int first = 0,second = 0,idx=0;
        while(first<arr1.length && second<arr2.length){
            if(arr1[first]<arr2[second]){
                merge[idx]=arr1[first];
                first++;idx++;
            }else{
                merge[idx]=arr2[second];
                second++;idx++;
            }
            
        }
        while(first<arr1.length){
                merge[idx]=arr1[first];
                first++;idx++;
        }
        while(second<arr2.length){
                merge[idx]=arr2[second];
                second++;idx++;
        }
        
        return merge;
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
        int[]merge = mergeArray(arr,arr1);
        for(int idx=0;idx<merge.length;idx++){
            System.out.print(merge[idx]+" ");
        }
    }   
}
