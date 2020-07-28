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
public class randomno {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a and n");
        double a=obj.nextDouble();
        int n=obj.nextInt();
        double b;  
        for(a=0;a<n;a++)
        {
        b = (Math.random());//((int)Math.random()*70);-->give in system.out.println
        System.out.println("random numbers"+(b));
            }
    }
}
