/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11.factory;

/**
 *
 * @author teacher
 */
public class FactoryDesignPattner {
    public static ICommand createCommand(String cmd){
        if("turn_on".equals(cmd)){
            return new TurnOnCommand();
        }else if("turn_off".equals(cmd)){
            return new TurnOffCommand();
        }
        return null;
    }
}
