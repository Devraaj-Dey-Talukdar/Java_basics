package com.java_basics;
import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[10];
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
            sum = sum + arr1[i];
        }
        System.out.println("The sum of all array elements is: "+sum);
        int largestNumber = arr1[0];
        int smallestNumber = arr1[0];
        for(int i=0; i<10 ; i++){
            if(arr1[i] > largestNumber)
                largestNumber = arr1[i];
            else if(arr1[1] < smallestNumber)
                smallestNumber = arr1[i];
        }
        System.out.println("The highest value: "+largestNumber);
        System.out.println("The lowest  value : "+smallestNumber);
    }
}
