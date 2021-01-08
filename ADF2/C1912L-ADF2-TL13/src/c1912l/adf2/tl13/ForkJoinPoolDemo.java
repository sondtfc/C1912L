/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teacher
 */
public class ForkJoinPoolDemo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Buoc 1: Khoi tao ForkJoinPool
        ForkJoinPool fjp = new ForkJoinPool(20);
        
        //Buoc 3: goi task
        List<String> list = getStringList();
        StringPrinter printer = new StringPrinter(list, 0, list.size()-1);
        fjp.invoke(printer);
        
        
    }

    public static List<String> getStringList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("Text " + i);
            
        }
        return list;
    }
    
    //Buoc 2: Tao class ke thua tu CounterCompleter
    public static class StringPrinter extends CountedCompleter<String>{
        public static final int THRESHOLD = 2;
        List<String> list;
        int start;
        int end;

        public StringPrinter(List<String> list, int start, int end) {
            this.list = list;
            this.start = start;
            this.end = end;
        }

        
        @Override
        public void compute() {
            if((end - start) <= THRESHOLD){
                //in ra chuoi
                for (int i = start; i < end; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ForkJoinPoolDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String get = list.get(i);
                    System.out.println(get +" from " + Thread.currentThread().getName());
                }
                propagateCompletion();
            }else{
                int mid = (end + start)/2;
                StringPrinter executer = new StringPrinter(list, start, mid);
                StringPrinter fork = new StringPrinter(list, mid, end);
                setPendingCount(1);
                fork.fork();                
                executer.compute();
            }
        }
        
    }
    
}
