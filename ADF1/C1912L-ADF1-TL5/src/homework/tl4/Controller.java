/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.tl4;

/**
 *
 * @author teacher
 */
public class Controller {
    public static final float LOWEST_TEMP = 18;
    public static final float HIGHEST_TEMP = 30;
    public static final float STEP_TEMP = 0.5f;
    public static final int LOWEST_FAN_LEVEL = 1;
    public static final int HIGHEST_FAN_LEVEL = 4;
    public static final int STEP_FAN_LEVEL = 4;
    
    
    AirConditioner ac;

    public Controller(AirConditioner ac) {
        this.ac = ac;
    }
    
    public void inscreTemp(){
        if(ac.temp >= HIGHEST_TEMP) return;
        ac.temp += STEP_TEMP;
    }
    
    public void descreTemp(){
        if(ac.temp <= LOWEST_TEMP) return;
        ac.temp -= STEP_TEMP;
    }
    
    public void changeMode(){
        Mode mode = ac.mode;        
        if(mode == Mode.COOL)
            ac.mode = Mode.DRY;
        else if( mode == Mode.DRY)
            ac.mode = Mode.HOT;
        else if(mode == Mode.HOT)
            ac.mode = Mode.COOL;
    }
    
    public void changeFanLevel(){
        if(ac.fanLevel == HIGHEST_FAN_LEVEL) ac.fanLevel = LOWEST_FAN_LEVEL - STEP_FAN_LEVEL;
        ac.fanLevel += STEP_FAN_LEVEL;
    }
    
    public  void reset(){
        ac.fanLevel = LOWEST_FAN_LEVEL;
        ac.mode = Mode.COOL;
        ac.temp = LOWEST_TEMP;
    }
    
    public void printStatus(){
        System.out.println(ac.fanLevel+"/"+ac.mode+"/"+ac.temp);
    }
    
    public void action(String action){
        if("+".equals(action))
            inscreTemp();
        else if("-".equals(action)){
            descreTemp();
        }
    }
}
