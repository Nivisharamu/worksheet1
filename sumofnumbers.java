
package javaapplication3;

import java.util.Scanner;


public class sumofnumbers {
    public static void main(String[] main)
    {
        int n,sum=0;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the limit");
        n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            sum= sum + obj.nextInt();
        }
        System.out.println("the sum of numbers"+sum);
    }
            
    
}
