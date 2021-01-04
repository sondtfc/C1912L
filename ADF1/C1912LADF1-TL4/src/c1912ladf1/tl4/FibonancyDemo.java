/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912ladf1.tl4;

/**
 *
 * @author teacher
 */
public class FibonancyDemo {
    
    public static void main(String[] args) {
        FibonancyDemo demo = new FibonancyDemo();
        demo.printFibonancy(10);
    }
    public void printFibonancy(int limit){
        long n2 = 0;
        long n1 = 1;
        System.out.println(n2);
        System.out.println(n1);

        for(int i = 2; i < limit; i++){
            long n = n2 + n1;
            System.out.println(n);
            n2 = n1;
            n1 = n;
        }
    }
}
