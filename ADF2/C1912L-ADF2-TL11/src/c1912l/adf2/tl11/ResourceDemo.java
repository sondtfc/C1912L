/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author teacher
 */
public class ResourceDemo {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("data");
        String helloText = bundle.getString("hello");
        System.out.println(helloText);
        
        bundle = ResourceBundle.getBundle("data", new Locale("vn"));
        helloText = bundle.getString("hello");
        System.out.println(helloText);
    }
}
