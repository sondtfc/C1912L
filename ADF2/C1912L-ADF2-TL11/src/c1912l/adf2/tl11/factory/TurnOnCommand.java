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
public class TurnOnCommand implements ICommand{

    @Override
    public void handle() {
        System.out.println("Turn On");
    }
    
}
