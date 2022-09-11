package com.bridgelabz;

import java.util.Scanner;

public class CheckEqualString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings");
        String s1 = sc.nextLine();
        System.out.println("Enter first string:" +s1);
        String  s2 = sc.nextLine();
        System.out.println("Enter second string:" +s2);
        if ( s1==s2){
            System.out.println("Strings are equals:");
        }else{
            System.out.println("Strings are not equals!");
        }

    }
}
