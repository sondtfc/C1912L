/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf1.tl5;

/**
 *
 * @author teacher
 */
public class Car extends Automotive{

    public Car(){
        
    }
    
    
    public Car(int wheelNumber){
       this.wheelNumber = wheelNumber; 
    }
    public Car(int wheelNumber, String color){
       this.wheelNumber = wheelNumber; 
       this.color = color;
    }
    
    
    @Override
    public void start() {
//        super.start(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Start automatically");
        stop();
    }
    
    @Override
    public void stop(){
        //default is foot
    }
    
    //overloading 
    
    public void stop(boolean isHand){
        
    }
    
    public void stop(int type){
        
    }
    
    public void stop(boolean isHand, boolean isFoot){
        
    }
    
    
    /**
     * 
     * @param color : may sac can sua
     * @param car : xe can in mau
     */
    public void print(String color, Car car){
        car.color = color;
    }
    
    public void printNew(String color, Car car){
        car = new Car();
        car.color = color;
    }
    
    
    
}
