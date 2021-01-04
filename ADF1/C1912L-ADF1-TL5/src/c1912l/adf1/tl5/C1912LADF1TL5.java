/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf1.tl5;

import c1912l.adf1.tl5.culculator.*;
import c1912l.adf1.tl5.culculator.CalculateFactory;

/**
 *
 * @author teacher
 */
public class C1912LADF1TL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 10;
        int y = 30;
        
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(x, y));
        
        AbsCalculate calculate = CalculateFactory.getCalculate("+");
        System.out.println(calculate.calculate(x, y));
        
        Car car1 = new Car();
        
        car1.start();
        car1.stop();
        car1.print("Red", car1);
        Car car2 = new Car();
        car1.print("Yellow", car2);
        
        System.out.println(car1.color +"/" + car2.color);
        
        int velocity = 100;
        car1.accelate(velocity);
        System.out.println(velocity);
        
        car1.printNew("Blue", car2);
        System.out.println(car2.color);
        
        
        
        Truck truck = new Truck();
        truck.start();
        
        Automotive automotive = new Car();
        automotive.start();
        
        
    }
    
}
