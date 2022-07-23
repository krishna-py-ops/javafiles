package com.company;

public class maxwealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,5},{34,45,6},{4,8,1}};
        System.out.println(maxwealth(accounts));
    }
    public static int maxwealth(int [][] accounts){
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum =0;
            for (int account = 0; account < accounts.length; account++) {
                rowsum += accounts[person][account];
            }
            if(rowsum > max){
                max = rowsum;
            }

        }
        return max;
    }
}
