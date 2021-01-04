/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.tl4;

import java.util.Scanner;

/**
 *
 * @author teacher
 */
public class AirConditionerDemo {
    public static void main(String[] args) {
        AirConditioner acMeetingRoom = new AirConditioner();

        Controller controller = new Controller(acMeetingRoom);
        controller.reset();
        Scanner scanner = new Scanner(System.in);
        System.out.println("+: temp inscrement \n -: temp descrement");
        
        while(true){
            String action = scanner.nextLine();
            controller.action(action);
            controller.printStatus();
        }
        
    }
    
}
