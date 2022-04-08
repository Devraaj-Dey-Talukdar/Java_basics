package com.java_basics;
import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder(n);
        for (int i=0; i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println("Reversed string : "+sb);
        String rev=sb.toString();
        if(n.equals(rev)){
            System.out.println("It is a palindrome string");
        }
        else{
            System.out.println("It is not a palindrome string");
        }

        }
    }

