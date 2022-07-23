package com.company;

import java.util.Arrays;

public class arrayswithfunc {
    //strings are immutable
    //Arrays are mutable
    public static void main(String[] args) {
        int [] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    //there is no pass by reference in java
    static void change(int[] arr){
        arr[0] = 99;
        arr[1] = 100;

    }
}
