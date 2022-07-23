package com.company;

public class evendigits {
    public static void main(String[] args) {
        int[] arr = {23,233,4556,7,-344};
        System.out.println(findnum(arr));
    }
    static int findnum(int[] nums){
        int c = 0;
        for(int num : nums){
            if(even(num)) { c++ ;}
        }
        return c;
    }
    static boolean even(int nums){
        int numdig = digits(nums);
        if(numdig % 2 ==0){
            return true;
        }
        return false;
    }
    static int digits2(int num){
        return (int)(Math.log10(num)+1);
    }
    static int digits(int num){
        int c = 0;
        while (num > 0){
            c++;
            num = num /10;
        }
        return num;
    }
}
