/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf1.tl5.culculator;

/**
 *
 * @author teacher
 */
public class CalculateFactory {
    public static AbsCalculate getCalculate(String operator){
        if("+".equals(operator)){
            return new Plus();
        }else if("-".equals(operator)){
            return new Minus();
        }else if("*".equals(operator)){
            return new Multi();
        }else if("/".equals(operator)){
            return new Devide();
        }
        return null;
    }
}
