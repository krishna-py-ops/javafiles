package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the temperature in celcius : ");
        Scanner input = new Scanner(System.in);
        float temp = input.nextFloat();
        float fahrenheit = (temp * 9/5) + 32;
        System.out.println("The Fahrenheit temperature is : " + fahrenheit);
    }
}
