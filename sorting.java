/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class sorting {
    public static void main(String[] args)
    {
        int a[]=new int[20];
        int n,temp;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter length");
        n=obj.nextInt();
        System.out.println("enter"+n+"element");
        for(int i=0;i<n;i++)
        {
          a[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
        {
             if(a[i]>a[j])
             {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
             }
        }
        
    }
        System.out.println("sorted element");
        for(int i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
        
    }
}
          
        
        
    
    

