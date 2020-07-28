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
public class prodisc {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the amount");
        double d=obj.nextDouble();
        System.out.println("discount amount");
        double d1=obj.nextDouble();
        double total=d/100*d1;
        System.out.println("commission amount"+(d-total));
    }
    
}
