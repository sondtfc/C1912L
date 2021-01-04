/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912ladf1.tl4;

import java.util.Scanner;

/**
 *
 * @author teacher
 */
public class SortDemo {
    int array[] = {1,3,9,3,20,45,10};
    
    
    public int[] sort(){
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = i+1; j < array.length; j++){
                if(array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        
        return array;
    }
    
    public static void main(String[] args) {
        SortDemo demo = new SortDemo();
        
        int[] sorted = demo.sort();
        for(int item:sorted){
            System.out.println(item);
        }
    }
    
}
