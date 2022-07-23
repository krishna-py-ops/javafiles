package com.company;
import java.util.Scanner;

public class patterns {
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            int spaces = n - totalColsInRow;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        for (int row = 1; row <=n; row++) {
            for(int space =0;space<n-row;space++){
                System.out.print("  ");
            }
            for(int col = row;col>=1;col--){
                System.out.print(col +  " ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //array basic code
        //datatype[] varname = new datatype[size];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);

    }
}
