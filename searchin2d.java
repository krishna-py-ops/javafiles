package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class searchin2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {23, 4, 1}, {18, 12, 3, 9}, {78, 96},{18,12}
        };
    int target = in.nextInt();
    int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr ,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col] == target){
                        return new int[]{row,col};
                    }
            }
        }
        return new int [] {-1,-1};
    }
}
