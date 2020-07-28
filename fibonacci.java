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
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int i;
        int a=0;
        int b=1;
        int c=0;
        int n;
        {
        System.out.println("enter n");
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {    
            c=a+b;
            System.out.println("fibonacci"+(c));
            a=b;
            b=c;
        }
        }
       
        
    }
    
}
