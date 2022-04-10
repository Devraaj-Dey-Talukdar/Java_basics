package com.java_basics;

import java.util.Scanner;

public class removeVowel
{
    public static void main(String args[])
    {
        String str1, str2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        str1 = sc.nextLine();
        str1 = str1.toUpperCase();

        str2 = str1.replaceAll("[AEIOU]", "");

        System.out.print("All Vowels Removed Successfully..!!\nNew String is : ");

        System.out.print(str2);
    }
}
