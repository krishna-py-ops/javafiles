package com.company;
import java.util.Locale;
import java.util.Scanner;
public class lowertoupper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
//        char str[] = s.toCharArray();
//        for(int i=0;i<str.length;i++){
//            if(str[i] >= 'a' && str[i] <= 'z'){
//                str[i] = (char)((int)str[i] - 32);
//            }
//        }
//        System.out.println("Upper String is : ");
//        for(int i=0;i<str.length;i++){
//            System.out.print(str[i]);
        s = s.toLowerCase();
        System.out.println(s);
        }
    }
