/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl15;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

/**
 *
 * @author teacher
 */
public class DictionaryDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"Text 1");
        hashtable.put(2,"Text 2");
        hashtable.put(3,"Text 2");
        Enumeration<Integer> keys = hashtable.keys();
        while(keys.hasMoreElements()){
            int key = keys.nextElement();
            System.out.println( key + ": " + hashtable.get(key));
        }
        
        Properties properties = new Properties();
        properties.setProperty("url", "https://hello.com");
        properties.setProperty("port", "8090");
        properties.setProperty("database", "mysql");
        
        Object get = properties.get("url");
        System.out.println(get);
        
        Enumeration<Object> elements = properties.elements();
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
