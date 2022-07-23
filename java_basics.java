package com.company;
import java.util.*;
import java.io.*;
public class java_basics {
    public static void main(String [] args) {
        Scanner ip = new Scanner(System.in);
        //int 9A = 20;
//        Scanner ip = new Scanner(System.in);
//        int a = ip.nextInt();
//        int b = ip.nextInt();
//        if((a % 10) == (b % 10)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//        Scanner s=new Scanner(System.in);
//        char c1=s.next().charAt(0);
//        char c2=s.next().charAt(0);
//        if(c1>c2) {
//            System.out.println(c2+","+c1);
//        }
//        else {
//            System.out.println(c1+","+c2);
//        }
//        Scanner s=new Scanner(System.in);
//        char c1=s.next().charAt(0);
//        if(c1 > 'a' &&  c1 < 'z') {
//            System.out.println("Alphabet");
//        }
//        else if(c1 >= '0' && c1 <= '9') {
//            System.out.println("Digit");
//        }
//        else {
//            System.out.println("Special Character");
//        }

//        char ch1 = ip.next().charAt(0);
//        //char ch2 = ip.next().charAt(0);
//        if(Character.isLowerCase(ch1)){
//            System.out.println(Character.toUpperCase(ch1));
//        }
//        char ch = ip.next().charAt(0);
//        switch (ch) {
//            case 'R' -> System.out.println("RED");
//            case 'B' -> System.out.println("BLUE");
//            case 'G' -> System.out.println("Green");
//            case 'O' -> System.out.println("Orange");
//            case 'Y' -> System.out.println("Yellow");
//            case 'W' -> System.out.println("White");
//        }
                int i,m=0,flag=0;
                int n=ip.nextInt();//it is the number to be checked
                m=n/2;
                if(n==0||n==1){
                    System.out.println(n+" is not prime number");
                }else{
                    for(i=2;i<=m;i++){
                        if(n%i==0){
                            System.out.println(n+" is not prime number");
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)  { System.out.println(n+" is prime number"); }
                }//end of else
            }
        }


