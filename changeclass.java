package com.company;
import java.util.Scanner;
public class changeclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        StringBuffer anew = new StringBuffer(a);
        for(int i=0;i<a.length();i++){
            if(Character.isLowerCase(a.charAt(i))){
                anew.setCharAt(i,Character.toUpperCase(a.charAt(i)));
            }
            else if(Character.isUpperCase(a.charAt(i))){
                anew.setCharAt(i,Character.toLowerCase(a.charAt(i)));
            }
        }
        System.out.println("String after conversion : " + anew);
    }
}
