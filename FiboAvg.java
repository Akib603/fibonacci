
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class FiboAvg {
    public static void main(String[] args) {
        int n1=0,n2=1,n3 = 0;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Num for the Range to print fibonacci :");
        
        int n=sc.nextInt();
        System.out.println("The first"+n+"num fibonacci are :");
        for(int i=1;i<=n;i++)
        {
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.print("   "+n3);
        }
        double avg=(double)n3/n;
        System.out.println("\n The avg is :"+avg);
        
    }
    
}
