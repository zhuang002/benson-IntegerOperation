/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integeroperation;

import java.util.Scanner;

/**
 *
 * @author huang
 */
public class IntegerOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        int c;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Please input a: ");
        a=sc.nextInt();
        System.out.print("Please input b: ");
        b=sc.nextInt();
        
        System.out.println("a="+a+",b="+b);
        
        c=a+b;
        System.out.println("a+b="+c);
        
        c=a-b;
        System.out.println("a-b="+c);
        
        c=a*b;
        System.out.println("a*b="+c);
        
        c=a/b;
        System.out.println("a/b="+c);
        
        c=a%b;
        System.out.println("a%b="+c);
        
        
    }
    
}
