/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author teacher
 */
public class LambdaDemo {


    public static interface MyFunction{
        public int handle(int a, int b);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Type 1
        MyFunction addition = (x,y) -> x + y;
        int result = addition.handle(10, 10);
        System.out.println(result);
        
        MyFunction multi = (x,y) -> x * y;
        result = multi.handle(10, 10);        
        System.out.println(result);
        
        //Type 2
        MyFunction devide = (int x, int y) -> x + y;
        
        //Type 3
        MyFunction type3 = (int x, int y) -> {return x + y;};
        
        //Type 4
        MyFunction type4 = (int x, int y) -> {
            x = x+ 10;
            return x + y;
        };
        
        Function<Integer, String> type5 = (x)-> "value is: " + x;
        System.out.println(type5.apply(10));
        
        Predicate<String> comparator = (String text) -> "name".equals(text);
        System.out.println(comparator.test("abc"));
        System.out.println(comparator.test("name"));
        
        List<Integer> list = getList();
        System.out.println("before sort: " + list);
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer t, Integer t1) {
//                return -(t - t1);
//            }
//        } );
//        
        Collections.sort(list, (t, t1) -> t -t1);
        
        System.out.println("after sort: " + list);
    }
    
        private static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 20; i++) {
                list.add(r.nextInt(100));                
            }
            return list;
    }

    
}
