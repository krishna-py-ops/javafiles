package com.company;

import java.util.Arrays;
// varargs parameter cannot be empty when it is overriding
public class varargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,63,12);
        multiple(2,3,78,89,90,91,92);
    }
    static void multiple(int a , int b , int ...v){ // variable argument parameter should br in last
        System.out.println(Arrays.toString( v));
    }
    static void fun(int ...v){ // variable arguments
        System.out.println(Arrays.toString(v));
    }
}
