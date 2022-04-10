package com.java_basics;
import java.util.Scanner;
public class seperatedbydot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String input = sc.nextLine();
        input = ' '+input;
        String shortName = "";
        int length = input.length();
        for(int i=0;i<length;i++){
            char ch = input.charAt(i);
            if (ch==' ')
                shortName = shortName+input.charAt(i+1)+'.';
        }
        System.out.println("Short Name :"+shortName);

    }
}
