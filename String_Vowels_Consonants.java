package com.java_basics;

import java.util.Scanner;

public class String_Vowels_Consonants {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,vowel=0,consonant=0;
        int length=str.length();
        System.out.println(str + '\t' + "Length:"+length);
        for(i=0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            str=str.toUpperCase();
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel++;
            }
            else if(ch!=' ') consonant++;

        }
        System.out.println("Total number of vowels = "+vowel);
        System.out.println("Total number of consonants = "+consonant);
    }
}
