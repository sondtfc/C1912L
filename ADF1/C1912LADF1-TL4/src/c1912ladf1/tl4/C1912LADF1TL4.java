/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912ladf1.tl4;

import java.util.Scanner;

/**
 *
 * @author teacher
 */
public class C1912LADF1TL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calculator = new Calculator();
        int minus = calculator.minus(100,10);
        System.out.println(minus);
        System.out.println("Input a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Input b: ");
        scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        
        System.out.println("a - b = "+calculator.minus(a, b));
        
    }
    
}
