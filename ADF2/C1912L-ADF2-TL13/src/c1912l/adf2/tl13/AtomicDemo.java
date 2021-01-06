/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl13;

import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/**
 *
 * @author teacher
 */
public class AtomicDemo {
    
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        for (int i = 0; i < 10; i++) {
            adder.add(i);
            System.out.println("added " + i +"="+adder.longValue());            
        }
        
        LongAccumulator ls = new LongAccumulator((l1,l2)->l1*l2, 1000);
        for (int i = 0; i < 10; i++) {
            ls.accumulate(i+1);
            System.out.println("accumulate " + i +"="+ls.longValue());            
        }
        
    }
    
}
