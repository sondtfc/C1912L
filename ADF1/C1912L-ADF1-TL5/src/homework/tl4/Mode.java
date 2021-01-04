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
public enum Mode {
    HOT(1), COOL(2), DRY(3);
    
    int id;
    Mode(int id){
        this.id = id;
    }
    
}
