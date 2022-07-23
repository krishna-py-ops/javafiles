package com.company;
import java.util.Scanner;

class reversenum {

    public static void main(String[] args) {
        int n = 895465;
        int ans = 0;
        while (n > 0) {

            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }

        System.out.println(ans);
    }


}