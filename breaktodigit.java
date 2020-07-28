/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.PrintStream;
import java.util.Scanner;


/**
 *
 * @author ELCOT
 */
public class breaktodigit {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n;
        int a[]=new int[10];
        int r,i = 0;
               {
            System.out.println("enter the value of n");
            n=obj.nextInt();
            while(n!=0)
            {
            {
                r=n%10;
                a[i]=r;
            }
            n=n/10;
            i++;
            
               System.out.println("splitted no"+(r));
            }
            for(int j=i-1;j>=0;j--)
                System.out.println(a[j]);
            
               }
    }
        }
    
    
    
    
    

