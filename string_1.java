package com.java_basics;
import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class string_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter a string");
        String input = sc.nextLine();
        int length = input.length();
        for (int i=0;i<=length-1;i++){
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch))
                ch =  Character.toLowerCase(ch);
            else {
                ch = Character.toUpperCase(ch);
            }
            System.out.print(ch);
        }
    }
}


