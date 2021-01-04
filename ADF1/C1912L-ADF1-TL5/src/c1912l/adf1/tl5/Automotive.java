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
public class Automotive {
    public String color;
    public int wheelNumber;
    
    public void start(){
        System.out.println("Start manual");
    }
    
    protected void stop(){
        System.out.println("Stop");
    }
    
    private void turnLight(){
        System.out.println("Turn on Light");
    }
    
    public void brake(){
        System.out.println("Brake");
    }
    
    public void accelate(int velocity){
        velocity += 100;
        System.out.println("Velocity: " + velocity);
    }
    
    void turnOffLight(){
        System.out.println("Turn off light");
    }
}
