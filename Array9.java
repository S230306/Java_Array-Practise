/*Write a Java program to find the frequency of each element in an array of integers and print the elements in descending order of their frequency. */
import java.util.*;
public class Array9 {
    public static int[] findFrequency(int[]arr){
        int[]freq = new int[10];
        for(int idx=0;idx<arr.length;idx++){
           freq[arr[idx]]++;
        }
        return freq; 
    }
    public static void printhefreq(int[]freq ){
        for(int idx=freq.length-1;idx>=0;idx--){
            if(freq[idx]>0){
            System.out.println(idx+" "+freq[idx]+"");
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
    int[]freq = findFrequency(arr);
    printhefreq(freq);
    }
  }  

