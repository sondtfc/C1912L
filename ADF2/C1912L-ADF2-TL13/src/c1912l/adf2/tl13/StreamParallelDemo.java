/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl13;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.stream.Stream;

/**
 *
 * @author teacher
 */
public class StreamParallelDemo {
    public static void main(String[] args) {
        List<String> list = ForkJoinPoolDemo.getStringList();
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach((s)->System.out.println(s + ": " + Thread.currentThread().getName()));
        
    }
}
