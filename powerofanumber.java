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
public class powerofanumber {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the values of a and n");
        int a=obj.nextInt();
        int n=obj.nextInt();
        int i,sum=1;
            
        for(i=0;i<n;i++)
        {
            sum=sum*a;
        }
       System.out.println(sum);
        }
        
            }
        
        
            
              
                
            
                
    
    
