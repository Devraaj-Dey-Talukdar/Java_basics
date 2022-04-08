package com.java_basics;
import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //int a[]={89,90,94,96,99};
        System.out.println("Enter the total number of array elements");
        int n=sc.nextInt();//to input array size
        int a[]= new int [n];
        System.out.println("Enter the array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();//to input all the array elements from the user
        }
        System.out.println("Enter number to search");
        int key=sc.nextInt();//input the number to search
        int li=0;//lowerIndex
        int hi=a.length-1;//HigherIndex
        boolean isFound = false;//for checking

        while(li<=hi){

            int mi=(li+hi)/2;//taking out the mid-value

            if (key==a[mi]){
                isFound=true;
                System.out.println("Element found at index position :"+" "+mi);
                break;
            }
            else if (a[mi]<key){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }

        }
        if(!isFound)System.out.println("Search Unsuccessful");

    }

}

