package com.java_basics;
import java.util.Scanner;
public class cnt_up_vol_charr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input[] = new char[10];
        int i;
        int upperCase=0;
        int vowelCount =0;
        System.out.println("Enter a character array");
        for( i=0;i<=input.length-1;i++){
             input[i] = sc.next().charAt(0);
            if(Character.isUpperCase(input[i]))
                upperCase++;
            if(input[i]=='A'||input[i]=='E'||input[i]=='I'||input[i]=='O'||input[i]=='U'||input[i]=='a'||input[i]=='e'||input[i]=='i'||input[i]=='o'||input[i]=='u'){
                vowelCount++;
            }
             //break;
        }
        System.out.println("Total number of uppercase characters : "+upperCase);
        System.out.println("Total number of vowels in the character : "+vowelCount);

    }
}
