package com.company;
import java.util.Scanner;
public class smallestletter {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        char[] letters = {'c','d','g','i','l','n','z'};
        char target = 'u';
        char ans = nxtgreaterletter(letters,target);
        System.out.println(ans);
    }
    // return the index of smallest no >= target
    static char nxtgreaterletter(char[] letters,char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

}

