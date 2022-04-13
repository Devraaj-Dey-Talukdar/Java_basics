import java.util.Scanner;

public class hkr_rank {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=0;
        int i;
        System.out.println("Enter the total number ");
         n=sc.nextInt();
         int a[]=new int[n];
         for(i=0;i<a.length;i++) {
             a[i] = sc.nextInt();
         }
         for(i=0;i<a.length;i++){
             System.out.println(a[i]);
         }

    }
}