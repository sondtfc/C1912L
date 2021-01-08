/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl15;

import java.util.BitSet;

/**
 *
 * @author teacher
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();
        
        bs1.set(1);
        bs1.set(3);
        bs1.set(4);
        bs2.set(3);
        bs2.set(1);
        bs2.set(5);
        
        System.out.println(bs1 + "/" + bs2);
        
        bs1.and(bs2);
        System.out.println(bs1);
        
        bs1.set(1);
        bs1.set(3);
        bs1.set(4);
        bs1.or(bs2);
        System.out.println(bs1);
        
        bs1.set(1);
        bs1.set(3);
        bs1.set(4);        
        bs1.set(7);
        bs1.andNot(bs2);
        System.out.println(bs1);
    }
    
}
