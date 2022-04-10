package com.java_basics;
import java.util.Scanner;
public class palin{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        String original = sc.nextLine();
        String reverse ="";
        int length = original.length()-1;
        for(int i=length;i>=0;i--)
            reverse=reverse+original.charAt(i);
            System.out.println("Reversed string :"+reverse);
            if (original.equals(reverse))
                System.out.println("Entered string is palindrome");
            else
                System.out.println("Entered string is not a palindrome");
    }
}