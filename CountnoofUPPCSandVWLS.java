package com.java_basics;
import java.util.Scanner;
public class CountnoofUPPCSandVWLS {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a character array");
        String input = sc.nextLine();
        int upperCase=0;
        int vowelCount=0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch))
                upperCase++;
        }
        System.out.println("Total Number of UpperCase: "+upperCase);
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vowelCount++;
        }
        System.out.println("Total Number of Vowel: "+vowelCount);
    }
}
