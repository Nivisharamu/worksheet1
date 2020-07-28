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
public class switchcase {
     public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter digits btwn 0 to 9");
        int a;
        a =obj.nextInt();
        
        switch(a)
        {
            case 0:
                System.out.println("0-zero");
                break;
            case 1:
                System.out.println("1-one");
                break;
            case 2:
                System.out.println("2-two");
                break;
            case 3:
                System.out.println("3-three");
                break;
            case 4:
                System.out.println("4-four");
                break;
            case 5:
                System.out.println("5-five");
                break;
            case 6:
                System.out.println("6-six");
                break;
            case 7:
                System.out.println("7-seven");
                break;
            case 8:
                System.out.println("8-eight");
                break;
            case 9:
                System.out.println("9-nine");
                break;
            default:
                 System.out.println("INVALID");
                break;
    
}
    
    }

}
