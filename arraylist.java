package com.company;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int key = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        linearsearch(arr,key);
         reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value of the array :"+maxval(arr));
    }
    static void linearsearch(int[] arr , int key){
        System.out.println("Enter key element");
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key) {
                System.out.println("Element"+key+"found at index"+i);
            }
            else {
                System.out.println(-1);
            }
        }
    }
    static int maxval(int[] arr){
//        Scanner ip = new Scanner(System.in);
//        int m = ip.nextInt();
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max) { max = arr[i];}
        }
        return max;
    }
    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int start ,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
