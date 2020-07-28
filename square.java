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
public class square {
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("enter the values of x1,x2,y1,y2");
       int x1=obj.nextInt();
       int x2=obj.nextInt();
       int y1=obj.nextInt();
       int y2=obj.nextInt();
       System.out.println("distance btwn the pts"+(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))));
       
    }
    
}
