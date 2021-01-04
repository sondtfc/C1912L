/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11;

/**
 *
 * @author teacher
 */
public class SingletonDesignPattern {
    private static SingletonDesignPattern obj;
    
    public static final SingletonDesignPattern getInstance(){
        if(obj == null){
            obj = new SingletonDesignPattern();
        }
        return obj;
    }

    private SingletonDesignPattern() {
        
    }
    
    
    
}
