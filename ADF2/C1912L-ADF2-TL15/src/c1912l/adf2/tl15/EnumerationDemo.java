/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl15;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author teacher
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        List<String> list = getList();
        
        MyEnumeration me = new MyEnumeration(list);
        while(me.hasMoreElements()){
            System.out.println(me.nextElement());
        }
    }

    private static List<String> getList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("Text " + i);
        }
        return list;
    }
    
    public static class MyEnumeration implements Enumeration<String>{
        List<String> list;
        int currentPosition;

        public MyEnumeration(List<String> list) {
            this.list = list;
            currentPosition = 0;
        }
        

        @Override
        public boolean hasMoreElements() {
            if(currentPosition == list.size()) return false;
            else return true;
        }

        @Override
        public String nextElement() {
            String get = list.get(currentPosition);
            currentPosition++;
            return get;
        }
        
    }
}
