package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	 Quick sort with explanation
	 */
        int[] arr = {7,9,1,3,5,0,2,45,21,14};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] arr, int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        // assumed pivot be the last element.
        int pivot = end;
        while(start<=end){
            while(arr[start]<arr[pivot]){
                start++;
            }
            while (arr[end]>arr[pivot]){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quick(arr,low,end);
        quick(arr,start,high);
    }
}
