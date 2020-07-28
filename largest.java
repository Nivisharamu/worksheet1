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
public class largest {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a,b,c values");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        
        if(a>b && a>c)
            System.out.println("a is larger");
        else if(b>a && b>c)
            System.out.println("b is larger");
        else
            System.out.println("c is larger");
    }
    
}
