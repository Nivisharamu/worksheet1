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
public class reversearray {
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter n");
    int n=obj.nextInt();
    System.out.println("enter the array elements");
    int a[]=new int[10];
    int i;
    {
    
    for(i=0;i<n;i++)
    {
        a[i]=obj.nextInt();
       
    }
    for(i=n-1;i>=0;i--)//for reverse order
    {
        System.out.println(a[i]);
    }
    }
    }
}

