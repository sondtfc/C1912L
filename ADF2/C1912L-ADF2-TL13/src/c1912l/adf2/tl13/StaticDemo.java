/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl13;

/**
 *
 * @author teacher
 */
public class StaticDemo {
    public static int a = 0;
    static {
        a = 100;
        add(10);
    }
    
    public static void add(int add){
        a += add;
    }
    public static void main(String[] args) {
        System.out.println(a);
        
        Runnable r = new Runnable() {
            @Override
            public void run() {
            }
        };
    }
}
