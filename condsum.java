package com.company;

public class condsum {
     static void condsum(int l[],int a,int b ){
         boolean add = true;
         int sum =0;
         for(int i=0;i<l.length;i++){
             if(l[i]!= a && add==true){
                  sum = sum + l[i];
             }
             else if(l[i] == a){
                 add = false;
             }
             else if(l[i] == b){
                 add = true;
             }
        }
         System.out.println(sum);
    }
    public static void main (String[] ar){
         int[] arr = {6,-98,6,78,67,98,7,23};
         int a = 6;
         int b = 7;
         condsum(arr,a,b);

    }
}
