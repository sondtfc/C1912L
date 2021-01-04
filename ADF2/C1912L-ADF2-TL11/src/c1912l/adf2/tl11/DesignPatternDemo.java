/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11;

import c1912l.adf2.tl11.factory.FactoryDesignPattner;
import c1912l.adf2.tl11.factory.ICommand;
import c1912l.adf2.tl11.factory.TurnOffCommand;

/**
 *
 * @author teacher
 */
public class DesignPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
        SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
        System.out.println("instance 1: " + instance);
        System.out.println("instance 2: " + instance2);
        
        ICommand turnOnCmd = FactoryDesignPattner.createCommand("turn_on");
        turnOnCmd.handle();
        ICommand turnOffCmd = FactoryDesignPattner.createCommand("turn_off");
        turnOffCmd.handle();
    }
    
}
