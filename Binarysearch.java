package com.company;
import java.util.Scanner;
public class Binarysearch {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //array must be sorted
        int [] arr = {-18,45 ,53 ,78 ,98 ,132 ,234 ,325};
        System.out.println("Enter target element to search : ");
        int target = ip.nextInt();
        int ans = binarysearch(arr , target);
        int ans2 = oabinarysearch(arr,target);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int binarysearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
    static int oabinarysearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        //find arr is sorted weather ascending or decending
        boolean isasc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
